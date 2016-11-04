package br.com.gep.sped.batch.common;

import br.com.gep.sped.marshaller.common.Registro;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa um nó na árvore de registros do SPED, com zero ou um registro pai e
 * zero ou muitos registros filhos.
 */
public class RegNode {

    private final Class<? extends Registro> regClass;
    private final char bloc;
    private RegNode parent;
    private LinkedList<RegNode> children;

    public RegNode(Class<? extends Registro> regClass) {
        if (regClass == null)
            throw new IllegalArgumentException("regClass is null");

        this.regClass = regClass;
        this.bloc = regClass.getSimpleName().charAt(3);
        this.children = new LinkedList<>();
    }

    public RegNode(Class<? extends Registro> regClass, RegNode parent) {
        this(regClass);
        this.parent = parent;
    }

    public RegNode(Class<? extends Registro> regClass, Class<? extends Registro> regParent) {
        this(regClass, new RegNode(regParent));
    }

    public Class<? extends Registro> getRegClass() {
        return regClass;
    }

    public char getBloc() {
        return bloc;
    }

    public RegNode getParent() {
        return parent;
    }

    public List<RegNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public RegNode addChild(RegNode child) {
        child.parent = this;
        children.add(child);

        return this;
    }

    public RegNode addChildren(RegNode... children) {
        for (RegNode node : children) {
            node.parent = this;
            this.children.add(node);
        }

        return this;
    }

    public RegNode removeChild(RegNode child) {
        children.remove(child);

        return this;
    }

    public boolean hasChildren() {
        return children != null && children.size() > 0;
    }

    public boolean hasParent() {
        return parent != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegNode)) return false;

        RegNode regNode = (RegNode) o;

        if (!regClass.equals(regNode.regClass)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return regClass.hashCode();
    }
}
