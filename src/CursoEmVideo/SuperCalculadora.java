package CursoEmVideo;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        // Iniciar Scanner para leitura
        Scanner scanner = new Scanner(System.in);

        // Obter número do usuário
        System.out.print("Coloque um número: ");
        double numero = scanner.nextDouble();

        // Realizar cálculos
        double restoDivisao = numero % 2;
        double elevadoCubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);
        double valorAbsoluto = Math.abs(numero);

        // Exibir resultados
        System.out.println("O resto da divisão é: " + restoDivisao);
        System.out.printf("O número %.2f elevado ao cubo é: %.2f\n", numero , elevadoCubo);
        System.out.printf("A raiz quadrada do número %.2f  é: %.2f\n", numero, raizQuadrada);
        System.out.printf("A raiz cubica do número %.2f é: %.2f\n", numero, raizCubica);
        System.out.println("O valor absoluto é: " + valorAbsoluto);

        // Fechar Scanner
        scanner.close();

    }
}
