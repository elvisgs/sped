package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE + 1)
public class NoOpReadFilter implements ReadFilter {

    @Override
    public boolean shouldRead(Class<? extends Registro> reg) {
        return true;
    }
}
