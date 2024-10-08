package CursoEmVideo;

import java.util.Scanner;

public class Repeticao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contagem de cambalhotas
        int cc = 1;
        do{
            System.out.println("Cambalhota " + cc);
            cc++;
        } while(cc < 5);


        // Contagem dos números
        int n, s = 0;
        String resposta;
        do {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
            s += n;
            System.out.print("Quer continuar: ");
            resposta = scanner.next();
        } while (resposta.equals("s"));
        System.out.println("A soma de todos os valores é " + s);

    }
}
