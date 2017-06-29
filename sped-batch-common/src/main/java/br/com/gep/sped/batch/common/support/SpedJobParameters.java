package br.com.gep.sped.batch.common.support;

import lombok.Data;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.*;

@Component
@JobScope
@Data
public class SpedJobParameters {

    @Value(CNPJ_ESTABELECIMENTO_EL)
    private String cnpj;

    @Value(CURRENT_SCHEMA_EL)
    private String currentSchema;

    @Value(COMPRESS_FILE_EL)
    private Boolean compressFile = true;

    @Value(DELETE_FILE_AFTER_COMPRESSION_EL)
    private Boolean deleteFileAfterCompression = true;

    @Value(OUTPUT_FILE_NAME_EL)
    private String outputFileName;

    @Value(PERFIL_ESTABELECIMENTO_EL)
    private String perfil = "A";
}
