package br.com.gep.sped.batch.common.support;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa um nó na árvore de registros do SPED, com zero ou um registro pai e
 * zero ou muitos registros filhos.
 */
@EqualsAndHashCode(of = "regClass")
public class RegNode {

    private final @NonNull @Getter Class<? extends Registro> regClass;
    private final @Getter char bloc;
    private @Getter RegNode parent;
    private LinkedList<RegNode> children;

    private RegNode(Class<? extends Registro> regClass) {
        this.regClass = regClass;
        this.bloc = regClass.getSimpleName().charAt(3);
        this.children = new LinkedList<>();
    }

    public List<RegNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public RegNode withParent(Class<? extends Registro> regParentClass) {
        parent = new RegNode(regParentClass);

        return this;
    }

    private RegNode withChild(RegNode child) {
        child.parent = this;
        children.add(child);

        return this;
    }

    public RegNode withChildren(RegNode... children) {
        for (RegNode node : children) withChild(node);

        return this;
    }

    public boolean hasChildren() {
        return children != null && children.size() > 0;
    }

    public boolean hasParent() {
        return parent != null;
    }

    public static RegNode of(Class<? extends Registro> regClass) {
        return new RegNode(regClass);
    }
}
