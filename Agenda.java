package com.fatec.ads.poo;

public class Agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;

    // Getters e Setters
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getMedico() { return medico; }
    public void setMedico(String medico) { this.medico = medico; }

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    // Método
    public void consultar() {
        System.out.println("Consultando agenda...");
    }
}
