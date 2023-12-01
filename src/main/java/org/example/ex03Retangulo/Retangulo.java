package org.example.ex03Retangulo;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        this.comprimento = 1.0;
        this.largura = 1.0;
    }

    public double calculaArea() {
        return comprimento * largura;
    }

    public double calculaPerimetro() {
        return 2 * (comprimento + largura);
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0.0 && comprimento < 20.0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Valor inválido para o comprimento. Deve ser maior que 0.0 e menor que 20.0.");
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Valor inválido para a largura. Deve ser maior que 0.0 e menor que 20.0.");
        }
    }

    public double getLargura() {
        return largura;
    }

}