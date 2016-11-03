package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoE.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class StepsBlocoEConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepRegE001() throws Exception {
        return stepFactory.create("stepRegE001", RegE001.class, Reg0000.class);
    }

    public Step stepRegE100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE100.class);

        return stepFactory.create("stepRegE100", tasklet);
    }

    public Step stepRegE200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE200.class);

        return stepFactory.create("stepRegE200", tasklet);
    }

    public Step stepRegE500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE500.class);

        return stepFactory.create("stepRegE500", tasklet);
    }

    public Step stepRegE990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegE990.class, Arrays.asList(
                RegE001.class, RegE100.class, RegE110.class, RegE111.class, RegE112.class,
                RegE113.class, RegE115.class, RegE116.class, RegE200.class, RegE210.class,
                RegE220.class, RegE230.class, RegE240.class, RegE250.class, RegE500.class,
                RegE510.class, RegE520.class, RegE530.class));

        return stepFactory.create("stepRegE990", tasklet);
    }
}
