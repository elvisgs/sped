package br.com.gep.sped.batch.common.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultItemProcessorLocator implements ItemProcessorLocator {

    private final ApplicationContext appContext;

    @SuppressWarnings("unchecked")
    @Override
    public <T> Optional<ItemProcessor<T, T>> find(Class<T> regClass) {
        return seekBeanName(regClass).map(s -> appContext.getBean(s, ItemProcessor.class));

    }

    private Optional<String> seekBeanName(Class regClass) {
        ResolvableType resolvableType = ResolvableType.forClassWithGenerics(ItemProcessor.class, regClass, regClass);
        String[] beanNames = appContext.getBeanNamesForType(resolvableType);

        if (beanNames.length == 0) return Optional.empty();

        if (beanNames.length > 1) {
            String message = String.format("Existe mais de uma implementação de %s para a classe %s",
                ItemProcessor.class.getName(), regClass.getName());
            throw new RuntimeException(message);
        }

        return Optional.of(beanNames[0]);
    }
}
