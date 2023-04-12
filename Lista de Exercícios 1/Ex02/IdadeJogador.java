import java.util.Scanner;

class Jogador {
    private int idade;
   
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void categoriaJogador(int idade) {
        if (idade < 14) {
            System.out.println("Jogador sem categoria");
        }
        else if (idade >= 14 && idade <= 15) {
            System.out.println("Categoria: Infantil");
        } 
        else if (idade >= 16 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } 
        else if (idade >= 18 && idade <= 20) {
            System.out.println("Categoria: Júnior");
        }
        else if (idade > 20) {
            System.out.println("Categoria: Profissional");
        }
    }
}

public class IdadeJogador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jogador jogador = new Jogador();
        System.out.print("Digite a idade do jogador: ");
        jogador.setIdade(input.nextInt());
        jogador.categoriaJogador(jogador.getIdade());

        input.close();
    }
}
