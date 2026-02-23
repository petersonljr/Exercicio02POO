package com.fatec.ads.poo;

public class Medico {
    private Long id;
    private String nome;
    private String crm;
    private String especialidade;

    // Construtor vazio
    public Medico() {
    }

    // Construtor com todos os atributos
    public Medico(Long id, String nome, String crm, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }


    public void mostrar() { 
        System.out.println("ID: " + id); 
        System.out.println("Nome: " + nome); 
        System.out.println("CRM: " + crm); 
        System.out.println("Especialidade: " + especialidade);
    }
}

