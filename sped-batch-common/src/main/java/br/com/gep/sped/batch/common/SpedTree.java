package br.com.gep.sped.batch.common;

import br.com.gep.sped.marshaller.common.Registro;

import java.util.*;

import static java.util.stream.Collectors.toList;

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

    public Collection<RegNode> getRootNodes() {
        return nodes.values();
    }

    public List<RegNode> getRootNodesOfBloc(char bloc) {
        List<RegNode> nodes = getRootNodes().stream()
            .filter(node -> node.getBloc() == bloc)
            .collect(toList());

        if (nodes.isEmpty())
            throw new IllegalArgumentException("Invalid bloc " + bloc);

        return nodes;
    }

    public List<RegNode> getAllNodesOfBloc(char bloc) {
        List<RegNode> nodes = new ArrayList<>();

        getRootNodesOfBloc(bloc).forEach(node -> {
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
