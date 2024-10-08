package CursoEmVideo;

import java.util.Scanner;

public class ExercicioRepita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, s = 0;
        int valores = 0;
        int pares = 0;
        int impares = 0;
        int acimaCem = 0;
        double media;

        do {
            System.out.print("Coloque um número (0 interrompe): ");
            n = scanner.nextInt();

            if (n == 0) {
                break;
            }
            s += n;
            valores++;

            if (n % 2 == 0) {
                pares++;
            }else{
                impares++;
            }

            if (n > 100) {
                acimaCem++;
            }


        } while(n != 0);

        media = (valores > 0) ? (double) s / valores : 0;

        System.out.println("------------");
        System.out.println("Resultado");
        System.out.println("------------");
        System.out.println("Total dos valores: " + valores);
        System.out.println("Total de pares: " + pares);
        System.out.println("Total de ímpares: " + impares);
        System.out.println("Acima de 100: " + acimaCem);
        System.out.printf("Média dos valores: %.2f", media);
    }
    
}
