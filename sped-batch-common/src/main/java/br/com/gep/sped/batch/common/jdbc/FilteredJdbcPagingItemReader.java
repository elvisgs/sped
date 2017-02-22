package br.com.gep.sped.batch.common.jdbc;

import br.com.gep.sped.batch.common.filters.CompositeReadFilter;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.database.JdbcPagingItemReader;

@RequiredArgsConstructor
public class FilteredJdbcPagingItemReader<T extends Registro> extends JdbcPagingItemReader<T> {

    private final Class<T> regClass;
    private final CompositeReadFilter readFilter;

    @Override
    protected T doRead() throws Exception {
        if (readFilter.shouldRead(regClass))
            return super.doRead();

        return null;
    }
}
