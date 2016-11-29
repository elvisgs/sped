package br.com.gep.sped.batch.common.support;

import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;

import static org.springframework.util.StringUtils.hasText;

@AllArgsConstructor
@NoArgsConstructor
public class DefaultFileNameStrategy implements FileNameStrategy {

    private String suffix = "";

    @Override
    public String build(Estabelecimento estabelecimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM");

        return String.format("%s_%s%s.txt",
            estabelecimento.getCnpj(),
            sdf.format(estabelecimento.getDtIni()),
            hasText(suffix) ? "_" + suffix : "");
    }
}
