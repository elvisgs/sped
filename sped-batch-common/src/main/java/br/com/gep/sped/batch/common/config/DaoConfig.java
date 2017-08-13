package br.com.gep.sped.batch.common.config;

import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.dao.EstabelecimentoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class DaoConfig {

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Bean @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public EstabelecimentoDao estabelecimentoDao() {
        EstabelecimentoDao estabelecimentoDao = new EstabelecimentoDao();
        estabelecimentoDao.setDataSource(infraConfig.getDataSource());
        estabelecimentoDao.setSelectQuery(queryPartsProvider.getQueryParts("Reg0000").toString());
        return estabelecimentoDao;
    }
}
