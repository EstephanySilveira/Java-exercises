package CursoEmVideo;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque um número: ");

        int n = scanner.nextInt();
        int f = 1;
        int c = n;

        while (c >=1) {
            f *= c;
            c--;
        }
        System.out.println(f);


    }
}
