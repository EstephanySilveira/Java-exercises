package CursoEmVideo;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        Arrays.fill(vetor, 0);

        for (int v:vetor) {
            System.out.print(v + " ");
        }

        while (true){
            System.out.println("\n");
            System.out.println("-> [1] Adicionar número ");
            System.out.println("-> [2] Remover número ");
            System.out.println("-> [3] Ordenar os números ");
            System.out.println("-> [0] Sair do sistema");
            System.out.print("Coloque sua opção: ");
            int menu = scanner.nextInt();

            if (menu == 1 || menu == 2 || menu == 3){
                if (menu == 1){
                    System.out.print("Escolha a posição (0-9): ");
                    int posi = scanner.nextInt();
                    if (posi>=0 && posi < vetor.length){
                        System.out.print("Coloque o número: ");
                        int num = scanner.nextInt();
                        vetor[posi] = num;
                    } else{
                        System.out.println("Posição inválida!");
                    }

                } else if (menu == 2) {
                    System.out.print("Escolha a opção para remover um número (0-9): ");
                    int posi = scanner.nextInt();
                    if (posi >=0 && posi < vetor.length){
                        vetor[posi] = 0;
                    }else{
                        System.out.println("Opção inválida");
                    }
                }else{
                    Arrays.sort(vetor);
                    System.out.println("Valor ordenado");
                }

            } else if (menu == 0) {
                break;

            }else {
                System.out.println("Opção inválida!");
            }

            System.out.println("Vetor atual: ");
            for (int valor:vetor) {
                System.out.print(valor + " ");
            }
        }
    }
}
