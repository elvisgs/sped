package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.AbstractIntegrationTest;
import br.com.gep.sped.batch.common.mocks.Reg9900ItemReader;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import org.junit.Test;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.test.MetaDataInstanceFactory;
import org.springframework.batch.test.StepScopeTestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class JdbcItemReaderFactoryTest extends AbstractIntegrationTest {

    @Autowired
    private ItemReaderFactory factory;

    @Test
    public void criaItemReaderGenerico() throws Exception {
        StepExecution stepExecution = MetaDataInstanceFactory.createStepExecution();
        StepScopeTestUtils.doInStepScope(stepExecution, () -> {
            ItemStreamReader<Reg9001> reader = factory.create(Reg9001.class);

            assertThat(unwrapProxy(reader)).isInstanceOf(JdbcCursorItemReader.class);

            return null;
        });
    }

    @Test
    public void criaItemReaderEspecifico() throws Exception {
        StepExecution stepExecution = MetaDataInstanceFactory.createStepExecution();
        StepScopeTestUtils.doInStepScope(stepExecution, () -> {
            ItemStreamReader<Reg9900> reader = factory.create(Reg9900.class);

            assertThat(unwrapProxy(reader)).isInstanceOf(Reg9900ItemReader.class);

            return null;
        });
    }

    private Object unwrapProxy(Object proxy) throws Exception {
        if(AopUtils.isAopProxy(proxy) && proxy instanceof Advised)
            return ((Advised) proxy).getTargetSource().getTarget();

        return proxy;
    }
}
