package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class StepsBlocoKConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepRegK001() throws Exception {
        return stepFactory.create("stepRegK001", RegK001.class, Reg0000.class);
    }

    public Step stepRegK100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegK100.class);

        return stepFactory.create("stepRegK100", tasklet);
    }

    public Step stepRegK990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegK990.class, Arrays.asList(
            RegK001.class, RegK100.class, RegK200.class, RegK220.class, RegK230.class, RegK235.class,
            RegK250.class, RegK255.class));

        return stepFactory.create("stepRegK990", tasklet);
    }
}
