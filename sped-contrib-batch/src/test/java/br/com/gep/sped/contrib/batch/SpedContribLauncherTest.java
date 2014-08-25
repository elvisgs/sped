package br.com.gep.sped.contrib.batch;

import org.junit.Test;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpedContribLauncherTest {

    @Test
    public void executaJobCorretamente() throws Exception {
        SpedContribLauncher launcher = new SpedContribLauncher();
        launcher.initialize();
        launcher.setSchema("sped_contrib");

        JobExecution execution = launcher.run("target/generated-test-sources/sped_test_result.txt");
        assertThat(execution.getStatus(), is(BatchStatus.COMPLETED));
    }
}
