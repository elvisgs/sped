package br.com.gep.sped.fiscal.batch.filters;

import br.com.gep.sped.batch.common.filters.ReadFilter;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.PERFIL_ESTABELECIMENTO_EL;
import static java.util.Arrays.asList;
import static org.springframework.util.StringUtils.hasText;

@Component
@JobScope
@PropertySource(value = {
    "classpath:sped-profiles.properties",
    "file:./sped-profiles.properties"
}, ignoreResourceNotFound = true)
@RequiredArgsConstructor
public class PerfilReadFilter implements ReadFilter {

    private final @NonNull Environment env;

    @Value(PERFIL_ESTABELECIMENTO_EL)
    private @Setter String perfil = "A";

    private List<String> regsToSkip = new ArrayList<>();

    @PostConstruct
    void init() {
        String key = String.format("sped.fiscal.perfil_%s.skip", perfil.toLowerCase());
        String regList = env.getProperty(key);

        if (hasText(regList))
            regsToSkip = asList(regList.toUpperCase().split("\\s*,\\s*"));
    }

    @Override
    public boolean shouldRead(@NonNull Class<? extends Registro> regClass) {
        String regName = regClass.getSimpleName().replaceFirst("^Reg", "");

        return !regsToSkip.contains(regName);
    }
}
