package br.com.gep.sped.fiscal.batch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
@Profile("v011")
public class TestConfigV011 extends TestConfig {

    @Value("classpath:sped_fiscal_test_schema_patch_v011.sql")
    private Resource patchV011;

    @Override
    protected void configureLayoutVersion() {
        versionConfigurer.configure("011");
    }

    @Override
    protected DatabasePopulator getDatabasePopulator() {
        DatabasePopulator databasePopulator = super.getDatabasePopulator();
        ((ResourceDatabasePopulator) databasePopulator).addScript(patchV011);
        return databasePopulator;
    }
}
