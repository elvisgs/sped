package br.com.gep.sped.fiscal.batch;

import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.batch.common.SpedLauncher;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import br.com.gep.sped.batch.common.jdbc.entity.Layout;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import br.com.gep.sped.batch.common.support.DefaultFileNameStrategy;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

import java.util.ArrayList;
import java.util.List;

public class SpedFiscalLauncher extends SpedLauncher {

    public SpedFiscalLauncher() {
        setFileNameStrategy(new DefaultFileNameStrategy("FISCAL"));
    }

    /**
     * Executa o job do SPED Fiscal para um estabelecimento.
     * @param cnpjEstabelecimento CNPJ do estabelecimento
     * @param outputFilePath Caminho do arquivo a ser gerado
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run(String cnpjEstabelecimento, String outputFilePath)
            throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
            JobRestartException, JobInstanceAlreadyCompleteException {
        estabelecimentoDao.setSchema(schema);
        Estabelecimento estabelecimento = estabelecimentoDao.obterUnico(cnpjEstabelecimento);

        return run(estabelecimento, outputFilePath);
    }

    private SpedExecution run(Estabelecimento estabelecimento, String outputFilePath)
            throws JobExecutionAlreadyRunningException, JobRestartException,
            JobInstanceAlreadyCompleteException, JobParametersInvalidException {
        if (outputFilePath == null || "".equals(outputFilePath.trim())) {
            outputFilePath = buildOutputFilePath(estabelecimento);
        }

        SpedJobParameterBuilder parametersBuilder = new SpedJobParameterBuilder()
            .setCnpjEstabelecimento(estabelecimento.getCnpj())
            .setPerfilEstabelecimento(estabelecimento.getIndPerfil())
            .setOutputFileName(outputFilePath)
            .setCompressFile(compressFile)
            .setDeleteFileAfterCompression(deleteFileAfterCompression);

        if (schema != null && !"".equals(schema))
            parametersBuilder.setCurrentSchema(schema);

        return doRun(outputFilePath, estabelecimento, parametersBuilder.toJobParameters());
    }

    /**
     * Executa o job do SPED Fiscal para um estabelecimento.
     * O arquivo de saída será definido automaticamente com base no destinationDir e
     * informações obtidas do BD do SPED (CNPJ, ano, mês).
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run(String cnpjEstabelecimento) throws JobParametersInvalidException,
            JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        return run(cnpjEstabelecimento, null);
    }

    /**
     * Executa o job do SPED fiscal para todos os estabelecimentos cadastrados.
     */
    public List<SpedExecution> run() throws JobParametersInvalidException,
            JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        estabelecimentoDao.setSchema(schema);
        List<Estabelecimento> estabelecimentos = estabelecimentoDao.obterTodos();

        ArrayList<SpedExecution> executions = new ArrayList<>();
        for (Estabelecimento estabelecimento : estabelecimentos) {
            SpedExecution execution = run(estabelecimento, null);
            executions.add(execution);
        }

        return executions;
    }

    @Override
    protected String getPackageToScan() {
        return SpedFiscalLauncher.class.getPackage().getName();
    }

    @Override
    protected Layout getLayout() {
        return Layout.SPED_FISCAL;
    }
}
