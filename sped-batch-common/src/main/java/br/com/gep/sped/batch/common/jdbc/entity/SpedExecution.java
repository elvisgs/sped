package br.com.gep.sped.batch.common.jdbc.entity;

import lombok.Data;
import org.springframework.batch.core.JobExecution;

@Data
public class SpedExecution {

    private Long id;
    private String cnpj, nome;
    private int ano, mes;
    private String arquivo;
    private Layout layout;
    private JobExecution jobExecution;
}
