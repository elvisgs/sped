package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@JobScope
@RequiredArgsConstructor
public class EmptyTableReadFilter implements ReadFilter {

    private final @NonNull EmptyTableChecker emptyTableChecker;
    private final @NonNull SpedTree spedTree;
    private List<Class<?>> regsToSkip = new ArrayList<>();

    @PostConstruct
    void init() {
        scanForEmptyTables();
    }

    @Override
    public boolean shouldRead(Class<? extends Registro> reg) {
        return !regsToSkip.contains(reg);
    }

    private void scanForEmptyTables() {
        spedTree.getRootNodes().stream()
            .filter(node -> !isCalculatedReg(node))
            .forEach(this::scanForEmptyTables);
    }

    private boolean isCalculatedReg(RegNode node) {
        return RegistroEncerramentoBloco.class.isAssignableFrom(node.getRegClass()) || node.getBloc() == '9';
    }

    private void scanForEmptyTables(RegNode root) {
        Class<? extends Registro> rootRegClass = root.getRegClass();
        if (tableIsEmpty(rootRegClass)) {
            regsToSkip.add(rootRegClass);
            return;
        }

        for (RegNode child : root.getChildren()) {
            Class<? extends Registro> childRegClass = child.getRegClass();
            boolean shouldSkip = tableIsEmpty(childRegClass);

            if (shouldSkip) {
                regsToSkip.add(childRegClass);
            } else if (child.hasChildren()) {
                scanForEmptyTables(child);
            }
        }
    }

    private boolean tableIsEmpty(Class<? extends Registro> regClass) {
        return emptyTableChecker.isEmpty(regClass);
    }
}
