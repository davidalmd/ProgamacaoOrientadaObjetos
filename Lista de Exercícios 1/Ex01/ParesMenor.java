import java.util.Random;
import java.util.Scanner;

public class ParesMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = 0;
        int qtdPares = 0;
        int menor = 0;
        
        System.out.println("Digite três números inteiros: ");
        for (int i = 0; i < 3; i++) {
            number = input.nextInt();
            if (number % 2 == 0) {
                qtdPares++;
            }
            
            if (i == 0) {
                menor = number;
            }
            else if (number < menor) {
                menor = number;
            }
        }

        int numberRandom = random.nextInt(11);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Menor número: " + menor);
        
        if (numberRandom == 0) {
            System.out.println("O menor número(" + menor + ") não é divisível por " + numberRandom);
        }
        else if (menor % numberRandom == 0) {
            System.out.println("O menor número(" + menor + ") é divisível por " + numberRandom);
        }
        else {
            System.out.println("O menor número(" + menor + ") não é divisível por " + numberRandom);
        }

        input.close();        
    }
}
