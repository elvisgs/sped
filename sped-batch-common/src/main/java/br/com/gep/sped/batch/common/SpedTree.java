package br.com.gep.sped.batch.common;

import br.com.gep.sped.marshaller.common.Registro;

import java.util.*;

public abstract class SpedTree {

    protected Map<Class<? extends Registro>, RegNode> nodes;

    public SpedTree() {
        nodes = new HashMap<>();
        addBranches();
    }

    protected abstract void addBranches();

    protected SpedTree addNode(RegNode node) {
        nodes.put(node.getRegClass(), node);
        return this;
    }

    // TODO: implementar busca profunda de nós
    public RegNode getNode(Class<? extends Registro> regClass) {
        return nodes.get(regClass);
    }

    public Map<Class<? extends Registro>, RegNode> getNodes() {
        return Collections.unmodifiableMap(nodes);
    }

    public List<RegNode> getNodesOfBloc(char bloc) {
        List<RegNode> nodes = new ArrayList<>();

        getNodes().values().stream()
            .filter(node -> node.getBloc() == bloc)
            .forEach(node -> {
                nodes.add(node);
                nodes.addAll(getAllChildren(node));
            });

        return nodes;
    }

    private List<RegNode> getAllChildren(RegNode node) {
        List<RegNode> nodes = new ArrayList<>();

        if (!node.hasChildren()) return nodes;

        List<RegNode> children = node.getChildren();
        nodes.addAll(children);

        children.forEach(c -> nodes.addAll(getAllChildren(c)));

        return nodes;
    }
}
