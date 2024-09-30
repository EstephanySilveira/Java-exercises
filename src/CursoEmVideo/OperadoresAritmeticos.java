package CursoEmVideo;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Média e resto
        int n1 = 4;
        int n2 = 5;
        float media = (float) (n1 + n2) / 2;
        float mediaResto = (float) (n1 + n2) % 2;

        System.out.println("A média é igual a: " + media);
        System.out.println("O resto da média é: " + mediaResto);

        // Pré e pós incremento
        int numero = 4;
        int valorPos = 5 + ++numero;
        int valorPre = 5 + numero++;
        System.out.println(("Valor pós incremento " + valorPos));
        System.out.println("Valor pré incremento " + valorPre);

        // Pré e pós decremento
        int valorNrmlMenos = 5 + numero;
        int valorPosMenos = 5 + numero--;
        int valorPreMenos = 5 + --numero;
        System.out.println("Valor normal " + valorNrmlMenos);
        System.out.println("Valor pós incremento " + valorPosMenos);
        System.out.println("Valor pré incremento " + valorPreMenos);

        // Atribuição
        int x = 4;
        x *= 2;
        System.out.println(x);

        // Arredondamento
        float resto = 5;
        float raiz = (float) Math.pow(resto, 2);
        System.out.println(raiz);
        float v = 8.2f;
        int at = (int) Math.ceil(v);
        System.out.println(at);

        // Gerador de número
        double ale = Math.random();
        int n = (int) (0 + ale * (10 - 0));
        System.out.println(n);





        }
}
