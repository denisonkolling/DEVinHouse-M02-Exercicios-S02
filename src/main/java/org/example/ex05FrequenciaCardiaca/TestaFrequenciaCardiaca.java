package org.example.ex05FrequenciaCardiaca;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaFrequenciaCardiaca {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Informe a data de nascimento (no formato YYYY-MM-DD): ");
            LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

            FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

            System.out.println("\nInformações da Pessoa:");
            System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
            System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
            System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
            System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");

            scanner.close();
        }
}
