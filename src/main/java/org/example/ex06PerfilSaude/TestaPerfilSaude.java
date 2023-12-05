package org.example.ex06PerfilSaude;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaPerfilSaude {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
        String dataNascimentoStr = scanner.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        PerfilSaude perfil = new PerfilSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        System.out.println("\nInformações do Perfil de Saúde:");
        System.out.println("Nome: " + perfil.getNome() + " " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de Nascimento: " + perfil.getDataNascimento());
        System.out.println("Altura: " + perfil.getAltura() + " metros");
        System.out.println("Peso: " + perfil.getPeso() + " quilogramas");
        System.out.println("Idade: " + perfil.calcularIdade() + " anos");
        System.out.println("IMC: " + perfil.calcularIMC());
        System.out.println("Frequência Cardíaca Máxima: " + perfil.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Intervalo de Frequência Cardíaca Alvo: " + perfil.calcularIntervaloFrequenciaCardiacaAlvo());

        scanner.close();
    }
}

