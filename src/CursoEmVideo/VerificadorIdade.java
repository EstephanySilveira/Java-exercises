package CursoEmVideo;

import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque seu nascimento: " );
        int nasc = scanner.nextInt();
        int idade = 2024 - nasc;

        String res = ((idade>=16 && idade<18) || (idade> 70))?"É opcional":"Não é opcional";
        System.out.println("Idade: " + idade);
        System.out.println(res);

    }
}

