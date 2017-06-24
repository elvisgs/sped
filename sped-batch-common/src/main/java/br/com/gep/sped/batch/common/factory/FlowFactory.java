package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Comparator.comparing;

@Component
@RequiredArgsConstructor
public class FlowFactory {

    private final SpedTree spedTree;
    private final StepFactory stepFactory;

    public Flow create(char bloc) {
        FlowBuilder<SimpleFlow> builder = new FlowBuilder<>("flowBloco" + bloc);

        if (bloc == '9') {
            builder.start(stepFactory.create(Reg9999.class));
        } else {
            List<RegNode> nodes = spedTree.getRootNodesOfBloc(bloc);
            nodes.sort(comparing(n -> n.getRegClass().getSimpleName()));

            builder.start(stepFactory.create(nodes.remove(0).getRegClass()));

            nodes.forEach(n ->
                builder.next(stepFactory.create(n.getRegClass())));
        }

        return builder.end();
    }
}
