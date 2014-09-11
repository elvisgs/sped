package br.com.gep.sped.contrib.batch.jdbc.entity;

import org.springframework.batch.core.JobExecution;

public class SpedExecution {

    private Long id;
    private String cnpj, nome;
    private int ano, mes;
    private String arquivo;
    private JobExecution jobExecution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public JobExecution getJobExecution() {
        return jobExecution;
    }

    public void setJobExecution(JobExecution jobExecution) {
        this.jobExecution = jobExecution;
    }
}
