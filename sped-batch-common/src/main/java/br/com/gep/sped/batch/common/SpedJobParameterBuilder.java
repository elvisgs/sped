package br.com.gep.sped.batch.common;

import org.springframework.batch.core.JobParametersBuilder;

public class SpedJobParameterBuilder extends JobParametersBuilder {

    public static final String OUTPUT_FILE_NAME = "output.file.name";
    public static final String CURRENT_SCHEMA = "current.schema";
    public static final String COMPRESS_FILE = "compress.file";
    public static final String DELETE_FILE_AFTER_COMPRESSION = "delete.file.after.compression";
    public static final String CNPJ_ESTABELECIMENTO = "cnpj.estabelecimento";

    public static final String OUTPUT_FILE_NAME_EL = "#{jobParameters['" + OUTPUT_FILE_NAME + "']}";
    public static final String CURRENT_SCHEMA_EL = "#{jobParameters['" + CURRENT_SCHEMA + "']}";
    public static final String COMPRESS_FILE_EL = "#{jobParameters['" + COMPRESS_FILE + "']}";
    public static final String DELETE_FILE_AFTER_COMPRESSION_EL = "#{jobParameters['" + DELETE_FILE_AFTER_COMPRESSION + "']}";
    public static final String CNPJ_ESTABELECIMENTO_EL = "#{jobParameters['" + CNPJ_ESTABELECIMENTO + "']}";

    public SpedJobParameterBuilder setOutputFileName(String outputFileName) {
        super.addString(OUTPUT_FILE_NAME, outputFileName);
        return this;
    }

    public SpedJobParameterBuilder setCurrentSchema(String currentSchema) {
        super.addString(CURRENT_SCHEMA, currentSchema);
        return this;
    }

    public SpedJobParameterBuilder setCompressFile(boolean compressFile) {
        super.addString(COMPRESS_FILE, String.valueOf(compressFile), false);
        return this;
    }

    public SpedJobParameterBuilder setDeleteFileAfterCompression(boolean deleteFileAfterCompression) {
        super.addString(DELETE_FILE_AFTER_COMPRESSION, String.valueOf(deleteFileAfterCompression), false);
        return this;
    }

    public SpedJobParameterBuilder setCnpjEstabelecimento(String cnpjEstabelecimento) {
        super.addString(CNPJ_ESTABELECIMENTO, cnpjEstabelecimento);
        return this;
    }
}
