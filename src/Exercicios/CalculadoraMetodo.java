package Exercicios;

import java.util.Scanner;

public class CalculadoraMetodo {
    public static int soma(int n1, int n2){
        return n1 + n2;
    }

    public static int subtracao(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicacao(int n1, int n2){
        return n1 * n2;
    }

    public static double divisao(int n1, int n2){
        if (n2 == 0) {
            System.out.println("Erro: Divisão por zero não é peermitida.");
            return 0;
        }
        return (double) n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Calculadora ------");
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Adição: " + n1 + " + " + n2 + " = " + soma(n1, n2));
        System.out.println("Subtração: " + n1 + " - " + n2 + " = " + subtracao(n1, n2));
        System.out.println("Multiplicação: " + n1 + " x " + n2 + " = " + multiplicacao(n1, n2));

        if (n2 != 0){
            System.out.println("Divisão: " + n1 + " / " + n2 + " = " + divisao(n1, n2));
        }else{
            System.out.println("Divisão: inválido!");
        }

        scanner.close();
    }

}

