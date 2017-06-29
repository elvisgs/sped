package br.com.gep.sped.batch.common.support;

import lombok.Getter;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.CNPJ_ESTABELECIMENTO_EL;

@Component
@JobScope
public class SpedJobParameters {

    @Value(CNPJ_ESTABELECIMENTO_EL)
    private @Getter String cnpj;
}
