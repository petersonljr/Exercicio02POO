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

    }
}
