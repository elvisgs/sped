package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0.Reg0000RowMapper;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.CNPJ_ESTABELECIMENTO_EL;

@Configuration
public class ItemReadersConfig {

    private static final String OVERRIDDEN_BY_EXPRESSION = null;

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Autowired
    private SchemaInjector schemaInjector;

    @Bean
    @StepScope
    public ItemStreamReader<Reg0000> reg0000ItemReader(@Value(CNPJ_ESTABELECIMENTO_EL) final String cnpjEstabelecimento) throws Exception {
        JdbcCursorItemReader<Reg0000> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        String sql = queryPartsProvider.getQueryParts(Reg0000.class).toString();
        reader.setSql(schemaInjector.injectSchema(sql));

        reader.setRowMapper(new Reg0000RowMapper());
        reader.setPreparedStatementSetter(new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1, cnpjEstabelecimento);
            }
        });

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    public ItemStreamReader<Reg0000> reg0000ItemReader() throws Exception {
        return reg0000ItemReader(OVERRIDDEN_BY_EXPRESSION);
    }
}
