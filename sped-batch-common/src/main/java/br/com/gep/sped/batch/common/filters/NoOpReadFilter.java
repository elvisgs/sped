package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.stereotype.Component;

@Component
public class NoOpReadFilter implements ReadFilter {

    @Override
    public boolean shouldRead(Class<? extends Registro> reg) {
        return true;
    }
}
