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
        return counts.getOrDefault(regClass, 0);
    }

    public void incrementCount(Class regClass, int increment) {
        counts.putIfAbsent(regClass, 0);
        counts.compute(regClass, (k, v) -> v + increment);
    }

    public void incrementCount(Class regClass) {
        incrementCount(regClass, 1);
    }
}
