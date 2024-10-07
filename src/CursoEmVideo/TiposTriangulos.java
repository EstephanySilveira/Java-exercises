package CursoEmVideo;

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do lado A: ");
        int a = scanner.nextInt();
        System.out.print("Valor do lado B: ");
        int b = scanner.nextInt();
        System.out.print("Valor do lado C: ");
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.print("Formam um triângulo ");
            if (a == b && b == c){
                System.out.println("equilátero");
            }else if (a!=b && b!=c && a!=c) {
                System.out.println("escaleno");
            } else {
                System.out.println("isóceles");
            }

        } else {
            System.out.println("Não formam um triângulo.");
        }
    }
}