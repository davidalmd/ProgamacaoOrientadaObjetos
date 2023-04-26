public class Arvore {

    private int idade;
    private String nome;
    private int idadeMax;
    private double tamanho;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (this.idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMax() {
        return this.idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        if (this.idadeMax < 0) {
            System.out.println("Idade máxima inválida.");
            return;
        }
        this.idadeMax = idadeMax;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void addIdade() {
        this.idade++;
        
        if (this.idade > this.idadeMax) {
            System.out.println("A árvore " + this.nome + " morreu.");
            return;
        }
        this.tamanho += 0.5;
    }
}
