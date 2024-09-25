import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número para verificar: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0 ) {
            System.out.println("O número " + n1 + " é par");
        } else {
            System.out.println("O número " + n1 + " é ímpar");
        }


    }
}
