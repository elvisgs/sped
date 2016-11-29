package br.com.gep.sped.batch.common.support;

import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;

@FunctionalInterface
public interface FileNameStrategy {

    String build(Estabelecimento estabelecimento);
}
