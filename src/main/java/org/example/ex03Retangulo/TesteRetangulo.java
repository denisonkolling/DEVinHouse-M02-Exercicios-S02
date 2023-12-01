package org.example.ex03Retangulo;

public class TesteRetangulo {

    public static void main(String[] args) {


        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(6.8);
        retangulo.setLargura(3.5);

        double comprimento = retangulo.getComprimento();
        double largura = retangulo.getLargura();


        System.out.println("Área do retângulo: " + retangulo.calculaArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calculaPerimetro());
    }
}

