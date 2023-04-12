import java.util.Scanner;

class Ano {
    private int ano;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}

public class Bissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ano ano = new Ano();
        System.out.print("Digite um ano: ");
        ano.setAno(input.nextInt());
        int valorAno = ano.getAno();

        if (valorAno % 4 == 0){
            if ((valorAno % 100 != 0) || (valorAno % 100 == 0 && valorAno % 400 == 0)) {
            System.out.println("O ano " + valorAno + " é bissexto.");
            }
        }
        else {
            System.out.println("O ano " + valorAno + " não é bissexto.");
        }

        input.close();
    }
}
