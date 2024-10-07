package CursoEmVideo;

import java.util.Scanner;

public class PogramaPernas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pernas? ");
        int pernas = scanner.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");

        tipo = switch (pernas) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Formiga";
            case 8 -> "Aranha";
            default -> "ET";
        };

        System.out.println(tipo);
    }
}
