package com.fatec.ads.poo;

public class Exame {
    private Consulta consulta;
    private String data;
    private String descritivo;

    // Getters e Setters
    public Consulta getConsulta() { return consulta; }
    public void setConsulta(Consulta consulta) { this.consulta = consulta; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getDescritivo() { return descritivo; }
    public void setDescritivo(String descritivo) { this.descritivo = descritivo; }

    // Métodos
    public void solicitar() { System.out.println("Exame solicitado."); }
    public void consultar() { System.out.println("Consultando exame..."); }
}

