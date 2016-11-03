package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.bloco1.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBloco1Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepReg1001() throws Exception {
        return stepFactory.create("stepReg1001", Reg1001.class, Reg0000.class);
    }

    public Step stepReg1010() throws Exception {
        return stepFactory.create("stepReg1010", Reg1010.class, Reg1001.class);
    }

    public Step stepReg1100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1100.class);

        return stepFactory.create("stepReg1100", tasklet);
    }

    public Step stepReg1200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1200.class);

        return stepFactory.create("stepReg1200", tasklet);
    }

    public Step stepReg1300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1300.class);

        return stepFactory.create("stepReg1300", tasklet);
    }

    public Step stepReg1350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1350.class);

        return stepFactory.create("stepReg1350", tasklet);
    }

    public Step stepReg1390() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1390.class);

        return stepFactory.create("stepReg1390", tasklet);
    }

    public Step stepReg1400() throws Exception {
        return stepFactory.create("stepReg1400", Reg1400.class, Reg1001.class);
    }

    public Step stepReg1500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1500.class);

        return stepFactory.create("stepReg1500", tasklet);
    }

    public Step stepReg1600() throws Exception {
        return stepFactory.create("stepReg1600", Reg1600.class, Reg1001.class);
    }

    public Step stepReg1700() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1700.class);

        return stepFactory.create("stepReg1700", tasklet);
    }

    public Step stepReg1800() throws Exception {
        return stepFactory.create("stepReg1800", Reg1800.class, Reg1001.class);
    }

    public Step stepReg1900() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1900.class);

        return stepFactory.create("stepReg1900", tasklet);
    }

    public Step stepReg1990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg1990.class, Arrays.asList(
                Reg1001.class, Reg1010.class, Reg1100.class, Reg1105.class, Reg1110.class,
                Reg1200.class, Reg1210.class, Reg1300.class, Reg1310.class, Reg1320.class,
                Reg1350.class, Reg1360.class, Reg1370.class, Reg1390.class, Reg1391.class,
                Reg1400.class, Reg1500.class, Reg1510.class, Reg1600.class, Reg1700.class,
                Reg1710.class, Reg1800.class, Reg1900.class, Reg1910.class, Reg1920.class,
                Reg1921.class, Reg1922.class, Reg1923.class, Reg1925.class, Reg1926.class));

        return stepFactory.create("stepReg1990", tasklet);
    }
}
