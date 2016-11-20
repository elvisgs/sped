package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static br.com.gep.sped.marshaller.common.RegistroAberturaBloco.COM_MOVIMENTO;
import static java.util.Collections.singletonList;
import static java.util.Comparator.comparing;

@Setter
public class Bloc9Tasklet implements Tasklet, InitializingBean {

    @NonNull private RegCounter regCounter;
    @NonNull private ItemStreamWriter writer;

    public void setRegCounter(RegCounter regCounter) {
        this.regCounter = regCounter;
    }

    public void setWriter(ItemStreamWriter writer) {
        this.writer = writer;
    }

    @SuppressWarnings("unchecked")
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        int countReg9 = 1;
        int countLines = 1;

        writer.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());

        Reg9001 reg9001 = new Reg9001(COM_MOVIMENTO);
        writer.write(singletonList(reg9001));
        countReg9++;

        List<Reg9900> regs9900 = new ArrayList<>();
        for (Map.Entry<Class, Integer> c : regCounter.getCounts().entrySet()) {
            Class regClass = c.getKey();
            String reg = regClass.getSimpleName().replace("Reg", "");
            Integer count = c.getValue();

            regs9900.add(new Reg9900(reg, count));

            countReg9++;
            countLines += count;
        }

        regs9900.add(new Reg9900("9001", 1));
        regs9900.add(new Reg9900("9990", 1));
        regs9900.add(new Reg9900("9999", 1));
        countReg9 += 3;

        regs9900.sort(comparing(r -> r.getRegBlc().toUpperCase()));
        writer.write(regs9900);

        Reg9900 reg9900 = new Reg9900("9900", countReg9 - 1); // subtrai 1 porque o reg9001 não entra no cálculo
        writer.write(singletonList(reg9900));
        countReg9++;

        Reg9990 reg9990 = new Reg9990(countReg9 + 1); // soma 1 porque o reg9999 também entra no cálculo
        writer.write(singletonList(reg9990));

        countLines += countReg9;
        Reg9999 reg9999 = new Reg9999(countLines);
        writer.write(singletonList(reg9999));

        writer.close();

        contribution.incrementWriteCount(reg9990.getQtdLin());

        return RepeatStatus.FINISHED;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(regCounter, "regCounter is null");
        Assert.notNull(writer, "writer is null");
    }
}
