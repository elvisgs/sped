package br.com.gep.sped.batch.common.jdbc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Estabelecimento {

    private long id;
    private String nome, cnpj, indPerfil;
    private Date dtIni;
}
