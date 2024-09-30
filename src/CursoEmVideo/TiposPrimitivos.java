package CursoEmVideo;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        System.out.print("A nota é " + nota);
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f ",nome, nota);
        System.out.format("A nota de %s é %.2f ",nome, nota);
       */

        int idade = 12;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String v = "30";
        int idadee = Integer.parseInt(v);
        System.out.println(idadee);

        String va = "30.5";
        float ida = Float.parseFloat(va);
        System.out.printf("%.3f", ida);
    }


}
