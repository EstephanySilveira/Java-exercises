package CursoEmVideo;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Coloque o valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Coloque o valor de C: ");
        int c = scanner.nextInt();

        double d = Math.pow(b,2) - 4 * a * c;

        System.out.printf("O valor do delta é %.2f \n", d);

        if (d < 0) {
            System.out.println("Não exixtem raízes Reais.");
        } else {
            System.out.println("Existem raízes Reais.");
        }

    }

}
