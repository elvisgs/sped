package br.com.gep.sped.marshaller.common.reflection;

import org.beanio.annotation.Group;
import org.beanio.annotation.Record;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;
import org.springframework.util.SystemPropertyUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeanIORecordLocator {

    public static List<Class> findAllFrom(String basePackage) throws IOException, ClassNotFoundException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resourcePatternResolver);

        List<Class> candidates = new ArrayList<>();

        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +
            resolveBasePackage(basePackage) + "/**/*.class";

        Resource[] resources = resourcePatternResolver.getResources(packageSearchPath);

        for (Resource resource : resources) {
            if (!resource.isReadable()) continue;

            MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);
            Class klass = Class.forName(metadataReader.getClassMetadata().getClassName());

            if (!isCandidate(klass)) continue;

            candidates.add(klass);
        }

        return candidates;
    }

    private static String resolveBasePackage(String basePackage) {
        return ClassUtils.convertClassNameToResourcePath(SystemPropertyUtils.resolvePlaceholders(basePackage));
    }

    private static boolean isCandidate(Class klass) throws ClassNotFoundException {
        return klass.isAnnotationPresent(Record.class) || klass.isAnnotationPresent(Group.class);
    }
}
