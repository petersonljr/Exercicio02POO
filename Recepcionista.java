package com.fatec.ads.poo;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    // Método
    public void acessar() {
        System.out.println("Recepcionista acessando o sistema...");
    }
}

