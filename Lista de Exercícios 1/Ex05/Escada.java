import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String degrau = "*";

        System.out.print("Digite a quantidade de degraus da escada: ");
        
        int qtdDegraus = input.nextInt();

        int degrausAux = qtdDegraus;

        for (int i = 0; i < qtdDegraus; i++) {
            for (int a = 0; a < degrausAux - 1; a++) {
                System.out.print(" ");
            }

            System.out.println(degrau);
            degrau = degrau + "*";
            degrausAux--;
            
        }

        input.close();
    }
}
