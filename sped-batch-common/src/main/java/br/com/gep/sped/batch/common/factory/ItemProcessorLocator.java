package br.com.gep.sped.batch.common.factory;

import org.springframework.batch.item.ItemProcessor;

import java.util.Optional;

public interface ItemProcessorLocator {

    <T> Optional<ItemProcessor<T, T>> find(Class<T> regClass);
}
