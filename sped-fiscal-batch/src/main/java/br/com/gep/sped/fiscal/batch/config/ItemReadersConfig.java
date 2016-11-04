package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.RegIdHolder;
import br.com.gep.sped.batch.common.SpedProperties;
import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.QueryParts;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0.Reg0000RowMapper;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0.Reg0190RowMapper;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0.Reg0200RowMapper;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0190;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0200;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.CNPJ_ESTABELECIMENTO_EL;

@Configuration
public class ItemReadersConfig {

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Autowired
    private SchemaInjector schemaInjector;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private SpedProperties spedProperties;

    @Bean
    @StepScope
    public ItemStreamReader<Reg0000> reg0000ItemReader(@Value(CNPJ_ESTABELECIMENTO_EL) String cnpjEstabelecimento)
        throws Exception {

        JdbcCursorItemReader<Reg0000> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        String sql = queryPartsProvider.getQueryParts(Reg0000.class).toString();
        reader.setSql(schemaInjector.injectSchema(sql));

        reader.setRowMapper(new Reg0000RowMapper());
        reader.setPreparedStatementSetter(preparedStatement ->
            preparedStatement.setString(1, cnpjEstabelecimento));

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    @Bean
    @StepScope
    public ItemStreamReader<Reg0200> reg0200ItemReader(@Value(CNPJ_ESTABELECIMENTO_EL) String cnpjEstabelecimento)
        throws Exception {

        JdbcPagingItemReader<Reg0200> reader = new JdbcPagingItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        QueryParts queryParts = queryPartsProvider.getQueryParts(Reg0200.class);
        SqlPagingQueryProviderFactoryBean queryProviderFactory = new SqlPagingQueryProviderFactoryBean();
        queryProviderFactory.setDataSource(infraConfig.getDataSource());

        String selectClause = schemaInjector.injectSchema(queryParts.getSelect());
        queryProviderFactory.setSelectClause(selectClause);

        String fromClause = schemaInjector.injectSchema(queryParts.getFrom());
        queryProviderFactory.setFromClause(fromClause);

        Map<String, Object> params = new HashMap<>();
        params.put("cnpj_pai", cnpjEstabelecimento);
        reader.setParameterValues(params);

        queryProviderFactory.setSortKey("id");

        reader.setQueryProvider(queryProviderFactory.getObject());

        reader.setPageSize(spedProperties.getChunkSize());
        reader.setRowMapper(new Reg0200RowMapper());

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    @Bean
    @StepScope
    public ItemStreamReader<Reg0190> reg0190ItemReader(@Value(CNPJ_ESTABELECIMENTO_EL) String cnpjEstabelecimento)
        throws Exception {

        JdbcPagingItemReader<Reg0190> reader = new JdbcPagingItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        QueryParts queryParts = queryPartsProvider.getQueryParts(Reg0190.class);
        SqlPagingQueryProviderFactoryBean queryProviderFactory = new SqlPagingQueryProviderFactoryBean();
        queryProviderFactory.setDataSource(infraConfig.getDataSource());

        String selectClause = schemaInjector.injectSchema(queryParts.getSelect());
        queryProviderFactory.setSelectClause(selectClause);

        String fromClause = schemaInjector.injectSchema(queryParts.getFrom());
        queryProviderFactory.setFromClause(fromClause);

        Map<String, Object> params = new HashMap<>();
        params.put("cnpj_pai", cnpjEstabelecimento);
        reader.setParameterValues(params);

        queryProviderFactory.setSortKey("id");

        reader.setQueryProvider(queryProviderFactory.getObject());

        reader.setPageSize(spedProperties.getChunkSize());
        reader.setRowMapper(new Reg0190RowMapper());

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }
}
