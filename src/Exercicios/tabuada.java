package Exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque um número para a tabuada: ");
        int n = scanner.nextInt();

        System.out.println("Tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
             double tabuada = n * i;
            System.out.printf("%d x %d = %.0f \n", n, i, tabuada);
        }
    }
}
