package CursoEmVideo;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é ímpar.", numero);
        }

    }
}
