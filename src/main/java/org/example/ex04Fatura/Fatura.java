package org.example.ex04Fatura;

public class Fatura {


    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;


    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoPorItem(precoPorItem);
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
            System.out.println("Quantidade não pode ser negativa!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem > 0.0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
            System.out.println("Preço não pode ser negativo!");
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public double getValorFatura() {
        return quantidade * precoPorItem;
    }

}
