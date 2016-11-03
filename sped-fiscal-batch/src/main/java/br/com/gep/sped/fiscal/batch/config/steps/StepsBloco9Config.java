package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class StepsBloco9Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    public Step stepBloco9() throws Exception {
        Tasklet tasklet = taskletFactory.createBloc9Tasklet();

        return stepFactory.create("stepBloco9", tasklet);
    }
}
