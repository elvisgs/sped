package br.com.gep.sped.batch.common.jdbc.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.batch.core.JobExecution;

import java.time.LocalDate;
import java.time.ZoneId;

@Data
@Accessors(chain = true)
public class SpedExecution {

    private Long id;
    private String cnpj, nome;
    private int ano, mes;
    private String arquivo;
    private Layout layout;
    private JobExecution jobExecution;

    public static SpedExecution from(Estabelecimento estabelecimento) {
        SpedExecution spedExecution = new SpedExecution();
        spedExecution.setCnpj(estabelecimento.getCnpj());
        spedExecution.setNome(estabelecimento.getNome());

        LocalDate dtIni = estabelecimento.getDtIni().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        spedExecution.setAno(dtIni.getYear());
        spedExecution.setMes(dtIni.getMonthValue());

        return spedExecution;
    }
}
