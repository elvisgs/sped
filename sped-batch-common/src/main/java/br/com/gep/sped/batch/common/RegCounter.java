package br.com.gep.sped.batch.common;

import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@JobScope
public class RegCounter {

    private final Map<Class, Integer> counts;

    public RegCounter() {
        counts = new HashMap<>();
    }

    public Map<Class, Integer> getCounts() {
        return counts;
    }

    public Integer getCount(Class regClass) {
        if (counts.containsKey(regClass)) {
            return counts.get(regClass);
        }

        return 0;
    }

    public void incrementCount(Class regClass, int increment) {
        if (!counts.containsKey(regClass)) {
            counts.put(regClass, 0);
        }

        Integer count = counts.get(regClass);
        counts.put(regClass, count + increment);
    }

    public void incrementCount(Class regClass) {
        incrementCount(regClass, 1);
    }
}
