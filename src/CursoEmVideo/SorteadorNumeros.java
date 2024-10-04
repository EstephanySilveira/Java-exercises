package CursoEmVideo;

import java.util.Scanner;

public class SorteadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução do jogo
        System.out.println("Vou pensar em uma valor entre 1 e 5. Tente adivinhar!");
        System.out.print("Valor: ");

        // Cpatura do valor do usuário
        int valor = scanner.nextInt();

        // gera um número aleatório entre 1 e 5
        int numeroSorteado = (int) (1 + Math.random() * 5 );

        // Comparação entre os valores
        String comparacao = (numeroSorteado == valor)?"Igual":"Diferente";
        System.out.println(comparacao);

        // Exibir o número sorteado
        System.out.printf("Número sorteado %d\n", numeroSorteado);
    }
}
