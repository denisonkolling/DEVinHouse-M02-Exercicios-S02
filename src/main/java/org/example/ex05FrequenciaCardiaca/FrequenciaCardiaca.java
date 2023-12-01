package org.example.ex05FrequenciaCardiaca;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int alvoMinimo = (int) (frequenciaMaxima * 0.5);
        int alvoMaximo = (int) (frequenciaMaxima * 0.85);
        return alvoMinimo + " - " + alvoMaximo;
    }
}

