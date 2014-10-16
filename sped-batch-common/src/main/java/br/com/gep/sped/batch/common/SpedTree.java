package br.com.gep.sped.batch.common;

import br.com.gep.sped.marshaller.common.Registro;

import java.util.HashMap;
import java.util.Map;

public abstract class SpedTree {

    protected Map<Class<? extends Registro>, RegNode> nodes;

    public SpedTree() {
        nodes = new HashMap<>();
        addBranches();
    }

    protected abstract void addBranches();

    // TODO: implementar busca profunda de nós
    public RegNode getNode(Class<? extends Registro> regClass) {
        return nodes.get(regClass);
    }

    public Map<Class<? extends Registro>, RegNode> getNodes() {
        return nodes;
    }
}
