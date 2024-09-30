package CursoEmVideo;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = idade.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idade_calculada = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade_calculada);

        idade.close();

    }
}
