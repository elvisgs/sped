package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(SpringRunner.class)
@Configuration
@ContextConfiguration(classes = DefaultItemProcessorLocatorTest.class)
public class DefaultItemProcessorLocatorTest {

    @Autowired
    private ItemProcessorLocator locator;

    @Test
    public void retornaEmptySeNaoEncontrarProcessor() {
        assertThat(locator.find(Reg9999.class)).isEmpty();
    }

    @Test
    public void retornaImplementacaoSeEncontrar() {
        assertThat(locator.find(Reg9900.class)).isPresent();
    }

    @Test
    public void lancaExcecaoSeExistirMaisDeUmaImplementacao() {
        assertThatThrownBy(() -> locator.find(Reg9001.class)).isInstanceOf(RuntimeException.class);
    }

    @Bean
    public ItemProcessorLocator itemProcessorLocator(ApplicationContext ctx) {
        return new DefaultItemProcessorLocator(ctx);
    }

    @Bean
    public ItemProcessor<Reg9900, Reg9900> reg9900ItemProcessor() {
        return new ItemProcessor<Reg9900, Reg9900>() {
            @Override
            public Reg9900 process(Reg9900 item) throws Exception {
                return item;
            }
        };
    }

    @Bean
    public ItemProcessor<Reg9001, Reg9001> reg9001ItemProcessorA() {
        return new ItemProcessor<Reg9001, Reg9001>() {
            @Override
            public Reg9001 process(Reg9001 item) throws Exception {
                return item;
            }
        };
    }

    @Bean
    public ItemProcessor<Reg9001, Reg9001> reg9001ItemProcessorB() {
        return new ItemProcessor<Reg9001, Reg9001>() {
            @Override
            public Reg9001 process(Reg9001 item) throws Exception {
                return item;
            }
        };
    }
}
