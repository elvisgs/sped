package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.config.MiscStepsConfig;
import br.com.gep.sped.batch.common.support.SpedTree;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.JobFlowBuilder;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
@Lazy
@RequiredArgsConstructor
public class JobFactory {

    private final SpedTree spedTree;
    private final JobBuilderFactory jobBuilderFactory;
    private final MiscStepsConfig miscStepsConfig;
    private final FlowFactory flowFactory;

    public Job create(String name) {
        Assert.hasText(name);

        JobFlowBuilder jobBuilder = jobBuilderFactory.get(name)
            .flow(miscStepsConfig.cleanupStep());

        for (Character bloc : spedTree.getBlocs()) {
            jobBuilder.next(flowFactory.create(bloc));
        }

        return jobBuilder
            .next(miscStepsConfig.zipFileStep())
            .end()
            .build();
    }
}
