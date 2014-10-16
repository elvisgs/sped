package br.com.gep.sped.batch.common.jdbc;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Esta classe destina-se a injetar o schema informado como job parameter (caso exista)
 * nas consultas SQL em tempo de execução do job, usando o token {@code @schema@}.
 * Ex.: Caso o schema 'foo' tenha sido adicionado como job parameter, a consulta
 * {@code 'select * from @schema@tabela'} se tornará {@code 'select * from foo.tabela'}.
 * Caso nenhum schema tenha sido informado, o token apenas será removido da consulta.
 */
@Component
@StepScope
public class SchemaInjector {

    public static final String SCHEMA_TOKEN = "@schema@";

    private String currentSchema;

    public SchemaInjector() {
    }

    public SchemaInjector(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    public String getCurrentSchema() {
        return currentSchema;
    }

    @Value("#{jobParameters['current.schema']}")
    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    public String injectSchema(String sql) {
        if (sql != null) {
            if (currentSchema != null && !"".equals(currentSchema))
                return sql.replaceAll(SCHEMA_TOKEN, currentSchema + ".");
            else
                return sql.replaceAll(SCHEMA_TOKEN, "");
        }

        return sql;
    }
}
