package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.factory.JdbcItemReaderFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0190;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0200;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
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
    private JdbcItemReaderFactory itemReaderFactory;

    @Bean
    @StepScope
    @Value(CNPJ_ESTABELECIMENTO_EL)
    public ItemStreamReader<Reg0000> reg0000ItemReader(String cnpjEstabelecimento) throws Exception {
        JdbcCursorItemReader<Reg0000> reader = itemReaderFactory.createCursorItemReader(Reg0000.class, null);
        reader.setPreparedStatementSetter(preparedStatement ->
            preparedStatement.setString(1, cnpjEstabelecimento));

        return reader;
    }

    @Bean
    @StepScope
    @Value(CNPJ_ESTABELECIMENTO_EL)
    public ItemStreamReader<Reg0200> reg0200ItemReader(String cnpjEstabelecimento) throws Exception {
        JdbcPagingItemReader<Reg0200> reader = itemReaderFactory.createPagingItemReader(Reg0200.class, null);

        Map<String, Object> params = new HashMap<>();
        params.put("cnpj_pai", cnpjEstabelecimento);
        reader.setParameterValues(params);

        return reader;
    }

    @Bean
    @StepScope
    @Value(CNPJ_ESTABELECIMENTO_EL)
    public ItemStreamReader<Reg0190> reg0190ItemReader(String cnpjEstabelecimento) throws Exception {
        JdbcPagingItemReader<Reg0190> reader = itemReaderFactory.createPagingItemReader(Reg0190.class, null);

        Map<String, Object> params = new HashMap<>();
        params.put("cnpj_pai", cnpjEstabelecimento);
        reader.setParameterValues(params);

        return reader;
    }
}
