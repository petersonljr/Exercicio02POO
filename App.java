package com.fatec.ads.poo;

public class App 
{
    public static void main( String[] args )
    {
        // Usando construtor vazio
        Paciente p1 = new Paciente();
        p1.setNome("João");
        p1.setIdade(30);

        // Usando construtor completo
        Paciente p2 = new Paciente("Maria", 25, "Rua das Flores", 1.65, 60.0);

        // Usando construtor vazio
        Medico m1 = new Medico();
        m1.setNome("Dr. Carlos");
        m1.setCrm("12345-SP");

        // Usando construtor completo
        Medico m2 = new Medico(1L, "Dra. Ana", "67890-SP", "Cardiologia");

        p1.mostrar();
        p2.mostrar();

        m1.mostrar();
        m2.mostrar();

        System.out.println(p1);
        System.out.println(m2);
        
        // Criando uma agenda
        Agenda agenda = new Agenda();
        agenda.setData("23/02/2026");
        agenda.setHora("14:00");
        agenda.setMedico("Dr. Silva");
        agenda.setPaciente("João");
        agenda.consultar();

        // Criando uma consulta
        Consulta consulta = new Consulta();
        consulta.setData("23/02/2026");
        consulta.setHora("14:00");
        consulta.setMedico("Dr. Silva");
        consulta.setPaciente("João");
        consulta.setMotivo("Dor de cabeça");
        consulta.setHistorico("Paciente já apresentou sintomas semelhantes.");
        consulta.marcar();
        consulta.consultar();

        // Criando uma receita vinculada à consulta
        Receita receita = new Receita();
        receita.setConsulta(consulta);
        receita.setData("23/02/2026");
        receita.setDescritivo("Dipirona 500mg - tomar 1 comprimido a cada 8h.");
        receita.prescrever();
        receita.consultar();

        // Criando um exame vinculado à consulta
        Exame exame = new Exame();
        exame.setConsulta(consulta);
        exame.setData("24/02/2026");
        exame.setDescritivo("Exame de sangue completo.");
        exame.solicitar();
        exame.consultar();

        // Criando um recepcionista
        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome("Maria");
        recepcionista.setCpf("123.456.789-00");
        recepcionista.setTelefone("(11) 99999-8888");
        recepcionista.setSenha("senhaSegura123");
        recepcionista.acessar();
    


    }
}
