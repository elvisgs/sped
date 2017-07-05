package br.com.gep.sped.batch.common.support;

import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class BeansByLayoutVersionConfigurer {

    private final ConfigurableListableBeanFactory beanFactory;
    private final Map<String, SpedTree> spedTreeBeans;
    private final QueryPartsProvider queryPartsProvider;

    @Value("classpath*:queries/queries-fiscal-patch-v*.elsql")
    private @Setter Resource[] queriesPatches;

    public void configure(String layoutVersion) {
        Assert.hasText(layoutVersion, "layoutVersion não pode ser nula ou estar em branco");

        configureSpedTree(layoutVersion);
        configureQueryPartsProvider(layoutVersion);
    }

    private void configureSpedTree(String layoutVersion) {
        if (spedTreeBeans.size() == 1) return;

        String spedTreeBeanName = spedTreeBeans.keySet().stream()
            .filter(beanName -> beanName.endsWith(layoutVersion))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Versão de layout inválida ou não suportada: " + layoutVersion));

        beanFactory.registerAlias(spedTreeBeanName, "spedTree");
    }

    private void configureQueryPartsProvider(String layoutVersion) {
        if (queriesPatches.length <= 0) return;

        Resource[] patchesToApply = Arrays.stream(queriesPatches)
            .filter(res -> isPatchCandidate(res, layoutVersion))
            .sorted(this::byFilename)
            .toArray(Resource[]::new);

        queryPartsProvider.patch(patchesToApply);
    }

    private boolean isPatchCandidate(Resource res, String layoutVersion) {
        String lastCandidatePatch = String.format("queries-fiscal-patch-v%s.elsql", layoutVersion);
        return res.getFilename().compareToIgnoreCase(lastCandidatePatch) <= 0;
    }

    private int byFilename(Resource r1, Resource r2) {
        return r1.getFilename().compareToIgnoreCase(r2.getFilename());
    }
}
