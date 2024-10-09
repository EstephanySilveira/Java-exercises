package Exercicios;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = scanner.nextInt();
        double soma = 0;

        for (int n1 = 1; n1 <= numero; n1++) {
            soma += n1;
        }
        System.out.printf("A soma do número de 1 até %d é %.0f \n", numero, soma);

        scanner.close();
    }
}
