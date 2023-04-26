public class Heroi {
    private int vidaMax = 100;
    private int vidaAtual = vidaMax;

    private int manaMax = 100;
    private int manaAtual = manaMax;

    private String nome;
    private String fraseEfeito;


    public int getVidaMax() {
        return this.vidaMax;
    }

    public int getVidaAtual() {
        return this.vidaAtual;
    }

    public int getManaMax() {
        return this.manaMax;
    }

    public int getManaAtual() {
        return this.manaAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFraseEfeito() {
        return this.fraseEfeito;
    }

    public void setFraseEfeito(String fraseEfeito) {
        this.fraseEfeito = fraseEfeito;
    }


    public void receberDano(int dano) {
        if (this.vidaAtual - dano <= 0) {
            this.vidaAtual = 0;
            System.out.println("O heroi " + this.nome + " morreu.");
        } else {
            this.vidaAtual -= dano;
        }
    }

}