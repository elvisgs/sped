package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.batch.common.SpedLauncher;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

public class SpedContribLauncher extends SpedLauncher {

    /**
     * Executa o job assincronamente
     * @param outputFilePath Caminho do arquivo a ser gerado
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run(String outputFilePath)
            throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
            JobRestartException, JobInstanceAlreadyCompleteException {
        estabelecimentoDao.setSchema(schema);
        Estabelecimento estabelecimento = estabelecimentoDao.getPrimeiro();

        if (outputFilePath == null || "".equals(outputFilePath.trim())) {
            outputFilePath = buildOutputFilePath(estabelecimento, "PIS");
        }

        SpedJobParameterBuilder parametersBuilder = new SpedJobParameterBuilder()
                .setOutputFileName(outputFilePath)
                .setCompressFile(compressFile)
                .setDeleteFileAfterCompression(deleteFileAfterCompression);

        if (schema != null && !"".equals(schema))
            parametersBuilder.setCurrentSchema(schema);

        return doRun(outputFilePath, estabelecimento, parametersBuilder.toJobParameters());
    }

    /**
     * Executa o job assincronamente. O arquivo de saída será definido automaticamente
     * com base no destinationDir e informações obtidas do BD do SPED (CNPJ, ano, mês).
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run() throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
            JobRestartException, JobInstanceAlreadyCompleteException {
        return run(null);
    }

    @Override
    protected String getPackageToScan() {
        return SpedContribLauncher.class.getPackage().getName();
    }
}
