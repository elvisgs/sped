package br.com.gep.sped.contrib.batch.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:selects.properties")
public class Selects {

    @Autowired
    Environment env;

    public String get(String key) {
        return env.getProperty(key);
    }

    public String get(Class<?> regClass) {
        String regName = regClass.getSimpleName().replaceAll("Reg", "");
        char block = regName.charAt(0);
        String key = String.format("bloco%s.%s", block, regName.toLowerCase());

        return get(key);
    }
}
