package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.*;

public class Bloco9Tasklet implements Tasklet, InitializingBean {

    private RegCounter regCounter;
    private ItemStreamWriter writer;

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

        Reg9001 reg9001 = new Reg9001() {{ setIndMov("0"); }};
        writer.write(Arrays.asList(reg9001));
        countReg9++;

        List<Reg9900> regs9900 = new ArrayList<>();
        for (Map.Entry<Class, Integer> c : regCounter.getCounts().entrySet()) {
            Class regClass = c.getKey();
            String reg = regClass.getSimpleName().replace("Reg", "");
            Integer count = c.getValue();

            Reg9900 reg9900 = new Reg9900();
            reg9900.setRegBlc(reg);
            reg9900.setQtdRegBlc(count);
            regs9900.add(reg9900);

            countReg9++;
            countLines += count;
        }

        regs9900.add(new Reg9900(){{ setRegBlc("9001"); setQtdRegBlc(1); }});
        regs9900.add(new Reg9900(){{ setRegBlc("9990"); setQtdRegBlc(1); }});
        regs9900.add(new Reg9900(){{ setRegBlc("9999"); setQtdRegBlc(1); }});
        countReg9 += 3;

        Collections.sort(regs9900, new Reg9900Comparator());
        writer.write(regs9900);

        Reg9900 reg9900 = new Reg9900(){{ setRegBlc("9900"); }};
        reg9900.setQtdRegBlc(countReg9 - 1); // subtrai 1 porque o reg9001 não entra no cálculo
        writer.write(Arrays.asList(reg9900));
        countReg9++;

        Reg9990 reg9990 = new Reg9990();
        reg9990.setQtdLin(countReg9 + 1); // soma 1 porque o reg9999 também entra no cálculo
        writer.write(Arrays.asList(reg9990));

        countLines += countReg9;
        Reg9999 reg9999 = new Reg9999();
        reg9999.setQtdLin(countLines);
        writer.write(Arrays.asList(reg9999));

        writer.close();

        contribution.incrementWriteCount(reg9990.getQtdLin());

        return RepeatStatus.FINISHED;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(regCounter, "regCounter is null");
        Assert.notNull(writer, "writer is null");
    }

    private class Reg9900Comparator implements Comparator<Reg9900> {
        @Override
        public int compare(Reg9900 o1, Reg9900 o2) {
            return o1.getRegBlc().compareToIgnoreCase(o2.getRegBlc());
        }
    }
}
