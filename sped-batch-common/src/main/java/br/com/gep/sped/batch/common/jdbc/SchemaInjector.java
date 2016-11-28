package br.com.gep.sped.batch.common.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.CURRENT_SCHEMA_EL;
import static org.springframework.util.StringUtils.hasText;

/**
 * Esta classe destina-se a injetar o schema informado como job parameter (caso exista)
 * nas consultas SQL em tempo de execução do job, usando o token {@code @schema@}.
 * Ex.: Caso o schema 'foo' tenha sido adicionado como job parameter, a consulta
 * {@code 'select * from @schema@tabela'} se tornará {@code 'select * from foo.tabela'}.
 * Caso nenhum schema tenha sido informado, o token apenas será removido da consulta.
 */
@Component
@StepScope
@AllArgsConstructor
@NoArgsConstructor
public class SchemaInjector {

    public static final String SCHEMA_TOKEN = "@schema@";

    private @Getter String currentSchema;

    @Value(CURRENT_SCHEMA_EL)
    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    public String injectSchema(String sql) {
        if (sql != null) {
            if (hasText(currentSchema))
                return sql.replaceAll(SCHEMA_TOKEN, currentSchema + ".");
            else
                return sql.replaceAll(SCHEMA_TOKEN, "");
        }

        return null;
    }
}
