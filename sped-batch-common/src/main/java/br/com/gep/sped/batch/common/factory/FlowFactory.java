package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.SpedTree;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Comparator.comparing;

@Component
public class FlowFactory {

    @Autowired
    private SpedTree spedTree;

    @Autowired
    private StepFactory stepFactory;

    public Flow create(char bloc) throws Exception {
        List<RegNode> nodes = spedTree.getRootNodesOfBloc(bloc);

        if (nodes.isEmpty()) throw new IllegalArgumentException("Invalid bloc " + bloc);

        nodes.sort(comparing(n -> n.getRegClass().getSimpleName()));

        FlowBuilder<SimpleFlow> builder = new FlowBuilder<SimpleFlow>("flowBloco" + bloc)
            .from(stepFactory.create(nodes.remove(0).getRegClass()));

        for (RegNode node : nodes) {
            builder.next(stepFactory.create(node.getRegClass()));
        }

        return builder.end();
    }
}
