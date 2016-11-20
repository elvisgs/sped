package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.SpedTree;
import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.List;

import static br.com.gep.sped.marshaller.common.RegistroAberturaBloco.SEM_MOVIMENTO;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

public class ClosingBlocRegTasklet implements Tasklet {

    private final @NonNull Class<? extends RegistroEncerramentoBloco> closingBlocRegClass;
    private @Setter @NonNull RegCounter regCounter;
    private @Setter @NonNull ItemStreamWriter writer;
    private @Setter @NonNull SpedTree spedTree;

    public ClosingBlocRegTasklet(Class<? extends RegistroEncerramentoBloco> closingBlocRegClass) {
        this.closingBlocRegClass = closingBlocRegClass;
    }

    @SuppressWarnings("unchecked")
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        List<Class> regsToCount = listRegsToCount();
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
            se count = 0 significa que não há movimentação no bloco e nem mesmo
            o registro de abertura existe, exceto se for o bloco 0 pois o registro 0000
            sempre existirá. Nestes casos, cria-se um registro de abertura de bloco
            com indicador de movimento igual a 1
             */
            writeOpeningBlocWithoutMoviment(openingBlocClass);

            contribution.incrementWriteCount(1);
            regCounter.incrementCount(openingBlocClass);
            count++;
        }

        RegistroEncerramentoBloco reg = closingBlocRegClass.newInstance();
        count++; // linha do registro de encerramento também entra na contagem
        reg.setQtdLin(count);

        writer.write(singletonList(reg));
        writer.close();

        contribution.incrementWriteCount(1);
        regCounter.incrementCount(closingBlocRegClass);

        return RepeatStatus.FINISHED;
    }

    private List<Class> listRegsToCount() {
        char bloc = spedTree.getNode(closingBlocRegClass).getBloc();

        return spedTree.getAllNodesOfBloc(bloc).stream()
            .filter(n -> n.getRegClass() != closingBlocRegClass)
            .map(RegNode::getRegClass)
            .collect(toList());
    }

    @SuppressWarnings("unchecked")
    private void writeOpeningBlocWithoutMoviment(Class openingBlocClass) throws Exception {
        RegistroAberturaBloco reg = (RegistroAberturaBloco) openingBlocClass.newInstance();
        reg.setIndMov(SEM_MOVIMENTO);
        writer.write(singletonList(reg));
    }
}
