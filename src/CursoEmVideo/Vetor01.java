package CursoEmVideo;

public class Vetor01 {
    public static void main(String[] args) {
        int[] n = {3, 2, 8, 7, 5, 4};

        // Lê a quantidade de índices dentro do vetor
        System.out.println("Total de cadas de N: " + n.length);

        // Forma de mostrar o conteúdo do vetor
        for(int c=0; c<=5; c++ ){
            System.out.println("Na posição " + c + " tem o valor " + n[c]);
        }

        // Estrutura de repetição genérica
        for(int c=0; c<=n.length-1; c++ ){
            System.out.println("Na posição " + c + " tem o valor " + n[c]);
        }

    }
}
