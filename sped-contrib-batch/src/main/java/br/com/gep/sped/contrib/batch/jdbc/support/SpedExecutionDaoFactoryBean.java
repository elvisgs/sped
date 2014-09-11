package br.com.gep.sped.contrib.batch.jdbc.support;

import br.com.gep.sped.contrib.batch.jdbc.dao.SpedExecutionDao;
import org.springframework.batch.item.database.support.DefaultDataFieldMaxValueIncrementerFactory;
import org.springframework.batch.support.DatabaseType;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.util.Assert;

import javax.sql.DataSource;

public class SpedExecutionDaoFactoryBean implements FactoryBean<SpedExecutionDao>, InitializingBean {

    private DataSource dataSource;
    private DataFieldMaxValueIncrementer incrementer;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public SpedExecutionDao getObject() throws Exception {
        if (dataSource == null || incrementer == null) {
            afterPropertiesSet();
        }

        SpedExecutionDao spedExecutionDao = new SpedExecutionDao();
        spedExecutionDao.setDataSource(dataSource);
        spedExecutionDao.setIncrementer(incrementer);
        return spedExecutionDao;
    }

    @Override
    public Class<?> getObjectType() {
        return SpedExecutionDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dataSource, "dataSource não deve ser nulo");

        DefaultDataFieldMaxValueIncrementerFactory incrementerFactory =
                new DefaultDataFieldMaxValueIncrementerFactory(dataSource);
        String databaseType = DatabaseType.fromMetaData(dataSource).name();
        incrementer = incrementerFactory.getIncrementer(databaseType, "BATCH_SPED_EXECUTION_SEQ");
    }
}
