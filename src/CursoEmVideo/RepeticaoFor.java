package CursoEmVideo;

import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o número de ínicio: ");
        int i = scanner.nextInt();
        System.out.print("Coloque o número do fim: ");
        int f = scanner.nextInt();
        System.out.print("Coloque o número de que pula: ");
        int p = scanner.nextInt();

        if (i< f){
            for (; i<=f; i += p){
                System.out.println(i);
            }
        }else{
            for(; i>=f; i-=p){
                System.out.println(i);
            }
        }
    }
}
