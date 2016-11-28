package br.com.gep.sped.batch.common.support;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Armazena o último id de cada registro lido
 */
@Component
@JobScope
public class RegIdHolder {

    private Map<Class<?>, Integer> ids = new HashMap<>();

    /**
     * Obtém último id do registro representado pela classe
     * @param regClass Classe do registro
     * @return Id do registro
     */
    public Integer getId(Class<?> regClass) {
        return ids.getOrDefault(regClass, 0);
    }

    /**
     * Seta id do registro representado pela classe
     * @param regClass Classe do registro
     * @param id Id a ser armazenado
     */
    public void setId(Class<?> regClass, Integer id) {
        ids.put(regClass, id);
    }
}
