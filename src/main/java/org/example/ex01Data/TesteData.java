package org.example.ex01Data;

public class TesteData {
    public static void main(String[] args) {

        Data dataExemplo = new Data();
        dataExemplo.setDia(26);
        dataExemplo.setMes(9);
        dataExemplo.setAno(1978);
        System.out.println("Data: " + dataExemplo.exibirData());

    }
}
