package com.fatec.ads.poo;

public class Consulta {
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    private String motivo;
    private String historico;

    // Getters e Setters
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getMedico() { return medico; }
    public void setMedico(String medico) { this.medico = medico; }

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getHistorico() { return historico; }
    public void setHistorico(String historico) { this.historico = historico; }

    // Métodos
    public void marcar() { System.out.println("Consulta marcada."); }
    public void cancelar() { System.out.println("Consulta cancelada."); }
    public void consultar() { System.out.println("Consultando detalhes da consulta..."); }
    public void realizar() { System.out.println("Consulta realizada."); }
    public void atualizar() { System.out.println("Consulta atualizada."); }
}

