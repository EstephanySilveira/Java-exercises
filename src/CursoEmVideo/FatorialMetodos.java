package CursoEmVideo;

import java.util.Scanner;

public class FatorialMetodos {

    public static int fatorial(int n){
        int f = 1;
        while (n >= 1) {
            f *= n;
            n--;
        }
        return  f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número para fatorar: ");
        int n = scanner.nextInt();
        int resultado = fatorial(n);

        System.out.println("O fatorial de " + n + " é " + resultado);

        scanner.close();
    }
}
