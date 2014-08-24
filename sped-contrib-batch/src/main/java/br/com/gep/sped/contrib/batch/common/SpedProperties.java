package br.com.gep.sped.contrib.batch.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:sped-batch.properties", ignoreResourceNotFound = true)
public class SpedProperties {

    public static final int DEFAULT_CHUNK_SIZE = 100;

    @Autowired
    private Environment env;

    public int getChunkSize() {
        return env.getProperty("sped.chunkSize", Integer.class, DEFAULT_CHUNK_SIZE);
    }
}
