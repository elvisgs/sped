package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.SpedTree;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
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
