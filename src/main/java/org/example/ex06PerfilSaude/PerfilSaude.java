package org.example.ex06PerfilSaude;

import java.time.LocalDate;
import java.time.Period;

public class PerfilSaude {

    private String nome;
    private String sobrenome;
    private char sexo;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public PerfilSaude(String nome, String sobrenome, char sexo, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    public String calcularIntervaloFrequenciaCardiacaAlvo() {
        int frequenciaCardiacaMaxima = calcularFrequenciaCardiacaMaxima();
        double percentagemMinima = 0.5;
        double percentagemMaxima = 0.85;
        int alvoMinimo = (int) (frequenciaCardiacaMaxima * percentagemMinima);
        int alvoMaximo = (int) (frequenciaCardiacaMaxima * percentagemMaxima);
        return alvoMinimo + " - " + alvoMaximo;
    }
}

