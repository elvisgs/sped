package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.contrib.batch.jdbc.dao.Reg0000Dao;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.support.SpedExecutionDaoFactoryBean;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class DaoConfig {

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Bean @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Reg0000Dao reg0000Dao() {
        Reg0000Dao reg0000Dao = new Reg0000Dao();
        reg0000Dao.setDataSource(infraConfig.getDataSource());
        reg0000Dao.setSelectQuery(queryPartsProvider.getQueryParts(Reg0000.class).toString());
        return reg0000Dao;
    }

    @Bean @Lazy
    public SpedExecutionDao spedExecutionDao() throws Exception {
        SpedExecutionDaoFactoryBean factory = new SpedExecutionDaoFactoryBean();
        factory.setDataSource(infraConfig.getDataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
