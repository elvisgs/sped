package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.List;

import static java.util.Collections.singletonList;

public class ClosingBlocRegTasklet<C extends RegistroEncerramentoBloco> implements Tasklet, InitializingBean {

    private final Class<C> closingBlocRegClass;
    private final List<Class<? extends Registro>> regsToCount;
    private RegCounter regCounter;
    private ItemStreamWriter writer;

    public ClosingBlocRegTasklet(Class<C> closingBlocRegClass, List<Class<? extends Registro>> regClassesToCount) {
        this.closingBlocRegClass = closingBlocRegClass;
        this.regsToCount = regClassesToCount;
    }

    public void setRegCounter(RegCounter regCounter) {
        this.regCounter = regCounter;
    }

    public void setWriter(ItemStreamWriter<C> writer) {
        this.writer = writer;
    }

    @SuppressWarnings("unchecked")
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        int count = 0;
        Class openingBlocClass = null;
        for (Class klass : regsToCount) {
            if (RegistroAberturaBloco.class.isAssignableFrom(klass))
                openingBlocClass = klass;

            count += regCounter.getCount(klass);
        }

        writer.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());

        boolean isBloc0 = closingBlocRegClass.getSimpleName().startsWith("Reg0");
        if (count == 0 || (count == 1 && isBloc0)) {
            /*
             * se count = 0 significa que não há movimentação no bloco e nem mesmo
             * o registro de abertura existe, exceto se for o bloco 0 pois o registro 0000
             * sempre existirá. Nestes casos, cria-se um registro de abertura de bloco
             * com indicador de movimento igual a 1.
             */
            writeOpeningBlocWithoutMoviment(openingBlocClass);

            contribution.incrementWriteCount(1);
            regCounter.incrementCount(openingBlocClass);
            count++;
        }

        C reg = closingBlocRegClass.newInstance();
        count++; // linha do registro de encerramento também entra na contagem
        reg.setQtdLin(count);

        writer.write(singletonList(reg));
        writer.close();

        contribution.incrementWriteCount(1);
        regCounter.incrementCount(closingBlocRegClass);

        return RepeatStatus.FINISHED;
    }

    @SuppressWarnings("unchecked")
    private void writeOpeningBlocWithoutMoviment(Class openingBlocClass) throws Exception {
        RegistroAberturaBloco reg = (RegistroAberturaBloco) openingBlocClass.newInstance();
        reg.setIndMov("1");
        writer.write(singletonList(reg));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(regsToCount);
        Assert.notNull(writer);
        Assert.notNull(regCounter);
    }
}
