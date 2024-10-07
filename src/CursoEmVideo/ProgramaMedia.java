package CursoEmVideo;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = scanner.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = scanner.nextFloat();

        float m = (n1 + n2) / 2;

        System.out.println("Sua média foi " + m);

        if (m>9) {
            System.out.println("Parábens");
        } else {
            System.out.println("Abaixo da média");
        }
    }
}
