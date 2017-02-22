package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.marshaller.common.Registro;

@FunctionalInterface
public interface ReadFilter {

    boolean shouldRead(Class<? extends Registro> reg);
}
