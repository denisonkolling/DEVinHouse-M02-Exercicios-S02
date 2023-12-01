package org.example.ex04Fatura;

public class TestaFatura {
    public static void main(String[] args) {

        Fatura fatura01 = new Fatura("1", "Monitor", 2, 299.00);
        Fatura fatura02 = new Fatura("2", "Mouse", 5, 59.00);

        System.out.println("Número da Fatura: " + fatura01.getNumero());
        System.out.println("Descrição: " + fatura01.getDescricao());
        System.out.println("Quantidade: " + fatura01.getQuantidade());
        System.out.println("Preço por Item: " + fatura01.getPrecoPorItem());
        System.out.println("Valor da Fatura: " + fatura01.getValorFatura());

        System.out.println("Número da Fatura: " + fatura02.getNumero());
        System.out.println("Descrição: " + fatura02.getDescricao());
        System.out.println("Quantidade: " + fatura02.getQuantidade());
        System.out.println("Preço por Item: " + fatura02.getPrecoPorItem());
        System.out.println("Valor da Fatura: " + fatura02.getValorFatura());
    }

}

