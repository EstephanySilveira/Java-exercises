package CursoEmVideo;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        // Iniciar Scanner para leitura
        Scanner scanner = new Scanner(System.in);

        // Obter número do usuário
        double numero = lerNumeros(scanner);

        // Realizar cálculos
        double restoDivisao = calcularRestoDivisao(numero);
        double elevadoCubo = calcularElevadoCubo(numero);
        double raizQuadrada = calcularRaizQuadrada(numero);
        double raizCubica = calcularRaizCubica(numero);
        double valorAbsoluto = calcularValorAbsoluto(numero);

        // Exibir resultados
        exibirResultados(numero, restoDivisao, elevadoCubo, raizQuadrada, raizCubica, valorAbsoluto);

        // Fechar Scanner
        scanner.close();
    }

    // Métodos para ler um número
    public static double lerNumeros(Scanner scanner) {
        System.out.print("Coloque um número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next(); // Limpar entrada inválida
        }
        return scanner.nextDouble();
    }

    // Métodos de cálculo separados
    public static double calcularRestoDivisao(double numero) {
        return numero % 2;
    }

    public static double calcularElevadoCubo(double numero) {
        return Math.pow(numero, 3);
    }

    public static double calcularRaizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }

    public static double calcularValorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    // Método para exibir os resultados
    public static void exibirResultados(double numero, double restoDivisao, double elevadoCubo, double raizQuadrada, double raizCubica, double valorAbsoluto) {
        System.out.println("---------------------------------");
        System.out.println("Resultados para o número: " + numero);
        System.out.println("---------------------------------");
        System.out.printf("O resto da divisão por 2: %.2f\n", restoDivisao);
        System.out.printf("Elevado ao cubo: %.2f\n", elevadoCubo);
        System.out.printf("A raiz quadrada: %.2f\n", raizQuadrada);
        System.out.printf("A raiz cubica: %.2f\n", raizCubica);
        System.out.printf("O valor absoluto é: %.2f\n",valorAbsoluto);
        System.out.println("----------------------------------");
    }





}





