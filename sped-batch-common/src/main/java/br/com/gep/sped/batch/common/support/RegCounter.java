package br.com.gep.sped.batch.common.support;

import lombok.Getter;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@JobScope
public class RegCounter {

    private final @Getter Map<Class, Integer> counts;

    public RegCounter() {
        counts = new HashMap<>();
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
