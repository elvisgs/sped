package br.com.gep.sped.batch.common.support;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.annotation.AfterWrite;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class RegInfoUpdater {

    private final RegCounter regCounter;
    private final RegIdHolder regIdHolder;

    @AfterWrite
    public void updateLastIdAndCount(List<? extends Registro> items) {
        Class<? extends Registro> regClass = items.get(0).getClass();
        Registro lastItem = items.get(items.size() - 1);
        regIdHolder.setId(regClass, lastItem.getId());
        regCounter.incrementCount(regClass, items.size());
    }

    public void updateLastIdAndCount(Registro item) {
        updateLastIdAndCount(Collections.singletonList(item));
    }
}
