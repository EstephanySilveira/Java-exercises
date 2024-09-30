package Exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções disponíveis
        System.out.println("Operações permitidoas: +, -, *, /");
        System.out.print("Qual operação você quer fazer: ");
        String op = scanner.nextLine();

        // Verifica se a operação inserida é válida
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            System.out.println("Opção inválida! Por favor, escolha uma das operações permitidas.");
        } else {
            // Solicita o primeiro e segundo número
            System.out.print("Coloque o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Coloque o segundo número: ");
            double n2 = scanner.nextDouble();

            // Variável para armazenar o resultado
            double resultado = 0;

            switch (op) {
                case "+":
                    resultado = n1 + n2;
                    break;
                case "-":
                    resultado = n1 - n2;
                    break;
                case "*":
                    resultado = n1 * n2;
                    break;
                case "/":
                    // Verifica divisão por zero
                    if (n2 != 0) {
                        resultado = n1 / n2;
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida.");
                    }
                    break;

            }

            // Exibe o resultado
            System.out.println("O resultado da operação é: " + resultado);

        }

        // Fecha o scanner
        scanner.close();

    }
}
