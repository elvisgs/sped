package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class StepsBlocoCConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepRegC001() throws Exception {
        return stepFactory.create("stepRegC001", RegC001.class, Reg0000.class);
    }

    public Step stepRegC100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC100.class);

        return stepFactory.create("stepRegC100", tasklet);
    }

    public Step stepRegC300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC300.class);

        return stepFactory.create("stepRegC300", tasklet);
    }

    public Step stepRegC350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC350.class);

        return stepFactory.create("stepRegC350", tasklet);
    }

    public Step stepRegC400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC400.class);

        return stepFactory.create("stepRegC400", tasklet);
    }

    public Step stepRegC500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC500.class);

        return stepFactory.create("stepRegC500", tasklet);
    }

    public Step stepRegC600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC600.class);

        return stepFactory.create("stepRegC600", tasklet);
    }

    public Step stepRegC700() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC700.class);

        return stepFactory.create("stepRegC700", tasklet);
    }

    public Step stepRegC800() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC800.class);

        return stepFactory.create("stepRegC800", tasklet);
    }

    public Step stepRegC860() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC860.class);

        return stepFactory.create("stepRegC860", tasklet);
    }

    public Step stepRegC990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegC990.class, Arrays.asList(
                RegC001.class, RegC100.class, RegC105.class, RegC110.class, RegC111.class,
                RegC112.class, RegC113.class, RegC114.class, RegC115.class, RegC116.class,
                RegC120.class, RegC130.class, RegC140.class, RegC141.class, RegC160.class,
                RegC165.class, RegC170.class, RegC171.class, RegC172.class, RegC173.class,
                RegC174.class, RegC175.class, RegC176.class, RegC177.class, RegC178.class,
                RegC179.class, RegC190.class, RegC195.class, RegC197.class, RegC300.class,
                RegC310.class, RegC320.class, RegC321.class, RegC350.class, RegC370.class,
                RegC390.class, RegC400.class, RegC405.class, RegC410.class, RegC420.class,
                RegC425.class, RegC460.class, RegC465.class, RegC470.class, RegC490.class,
                RegC500.class, RegC510.class, RegC590.class, RegC600.class, RegC601.class,
                RegC610.class, RegC690.class, RegC700.class, RegC790.class, RegC791.class,
                RegC800.class, RegC850.class, RegC860.class, RegC890.class));

        return stepFactory.create("stepRegC990", tasklet);
    }
}
