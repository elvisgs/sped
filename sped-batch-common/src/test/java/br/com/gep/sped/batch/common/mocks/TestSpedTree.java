package br.com.gep.sped.batch.common.mocks;

import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.stereotype.Component;

@Component
public class TestSpedTree extends SpedTree {

    @Override
    protected void addBranches() {
        addNode(RegNode.of(Reg9001.class));
        addNode(RegNode.of(Reg9900.class).withParent(Reg9001.class));
        addNode(RegNode.of(Reg9990.class));
        addNode(RegNode.of(Reg9999.class));
    }
}
