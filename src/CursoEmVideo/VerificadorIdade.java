package CursoEmVideo;

import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque seu nascimento: " );
        int nasc = scanner.nextInt();
        int idade = 2024 - nasc;

        // Verificaçãp simplificada para voto opcional
        String res = ((idade>=16 && idade<18) || (idade> 70))?"É opcional":"Não é opcional";
        System.out.print("Idade: " + idade + " o voto ");
        System.out.println(res);

        // Verificação detalhada das regras de voto
        if (idade < 16) {
            System.out.println("Não vota");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Voto opcional!");
        } else {
            System.out.println("Voto obrigatório");
        }

        // Fechar o scanner para evitar problemas de recursos
        scanner.close();
    }
}

