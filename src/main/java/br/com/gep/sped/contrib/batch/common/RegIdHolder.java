package br.com.gep.sped.contrib.batch.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RegIdHolder {

    private Map<Class<?>, Integer> ids = new HashMap<Class<?>, Integer>();

    public Integer getId(Class<?> parentClass) {
        if (ids.containsKey(parentClass))
            return ids.get(parentClass);

        return 0;
    }

    public void setId(Class<?> parentClass, Integer id) {
        ids.put(parentClass, id);
    }
}
