package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoD.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class StepsBlocoDConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepRegD001() throws Exception {
        return stepFactory.create("stepRegD001", RegD001.class, Reg0000.class);
    }

    public Step stepRegD100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD100.class);

        return stepFactory.create("stepRegD100", tasklet);
    }

    public Step stepRegD300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD300.class);

        return stepFactory.create("stepRegD300", tasklet);
    }

    public Step stepRegD350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD350.class);

        return stepFactory.create("stepRegD350", tasklet);
    }

    public Step stepRegD400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD400.class);

        return stepFactory.create("stepRegD400", tasklet);
    }

    public Step stepRegD500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD500.class);

        return stepFactory.create("stepRegD500", tasklet);
    }

    public Step stepRegD600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD600.class);

        return stepFactory.create("stepRegD600", tasklet);
    }

    public Step stepRegD695() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD695.class);

        return stepFactory.create("stepRegD695", tasklet);
    }

    public Step stepRegD990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegD990.class, Arrays.asList(
                RegD001.class, RegD100.class, RegD110.class, RegD120.class, RegD130.class,
                RegD140.class, RegD150.class, RegD160.class, RegD161.class, RegD162.class,
                RegD170.class, RegD180.class, RegD190.class, RegD195.class, RegD197.class,
                RegD300.class, RegD301.class, RegD310.class, RegD350.class, RegD355.class,
                RegD360.class, RegD365.class, RegD370.class, RegD390.class, RegD400.class,
                RegD410.class, RegD411.class, RegD420.class, RegD500.class, RegD510.class,
                RegD530.class, RegD590.class, RegD600.class, RegD610.class, RegD690.class,
                RegD695.class, RegD696.class, RegD697.class));

        return stepFactory.create("stepRegD990", tasklet);
    }
}
