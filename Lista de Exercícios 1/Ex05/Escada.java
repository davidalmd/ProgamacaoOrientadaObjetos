
import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus da escada: ");
        int qtdDegraus = input.nextInt();

        for (int i = qtdDegraus; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
