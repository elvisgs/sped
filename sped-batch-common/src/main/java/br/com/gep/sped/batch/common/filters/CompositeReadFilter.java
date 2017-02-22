package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CompositeReadFilter implements ReadFilter {

    private final List<ReadFilter> readFilters;

    @Override
    public boolean shouldRead(Class<? extends Registro> reg) {
        boolean shouldRead = true;

        for (ReadFilter filter : readFilters)
            shouldRead = filter.shouldRead(reg);

        return shouldRead;
    }
}
