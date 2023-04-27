public class Heroi {
    private int vidaMax = 100;
    private int vidaAtual = vidaMax;

    private int manaMax = 100;
    private int manaAtual = manaMax;

    private String nomeNormal;
    private String nomeHeroi;
    private String fraseEfeito;

    private boolean disfarce = true;


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

    public String getNomeHeroi() {
        return this.nomeHeroi;
    }

    public void setNomeHeroi(String nome) {
        this.nomeHeroi = nome;
    }

    public String getNomeNormal() {
        return this.nomeNormal;
    }

    public void setNomeNormal(String nome) {
        this.nomeNormal = nome;
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
            System.out.println("O heroi " + this.nomeHeroi + " morreu.");
            System.out.println();
        } else {
            this.vidaAtual -= dano;
        }
    }

    public void usarMagia(int quantidade) {
        if (this.manaAtual - quantidade < 0) {
            System.out.println("O heroi " + this.nomeHeroi + " não possui mana suficiente.");
            System.out.println();
        } else {
            this.manaAtual -= quantidade;
        }
    }

    public void recuperarVida(int quantidade) {
        if (this.vidaAtual + quantidade > this.vidaMax) {
            this.vidaAtual = this.vidaMax;
        } else {
            this.vidaAtual += quantidade;
        }
    }

    public void recuperarMagia(int quantidade) {
        if (this.manaAtual + quantidade > this.manaMax) {
            this.manaAtual = this.manaMax;
        } else {
            this.manaAtual += quantidade;
        }
    }

    public void gritoDeGuerra() {
        System.out.println(this.fraseEfeito);
        System.out.println();
    }

    public void statusHeroi() {
        System.out.println("Nome de Humano: " + this.nomeNormal);
        System.out.println("Nome de Heroi: " + this.nomeHeroi);
        System.out.println("Vida: " + this.vidaAtual + "/" + this.vidaMax);
        System.out.println("Mana: " + this.manaAtual + "/" + this.manaMax);
        System.out.println();
    }

    public void uparNivel() {
        this.vidaMax += 10;
        this.vidaAtual = this.vidaMax;
        this.manaMax += 10;
        this.manaAtual = this.manaMax;
    }

    public void voar() {
        System.out.println("O heroi " + this.nomeHeroi + " está voando.");
        System.out.println();
    }

    public void transformar(){
        if (this.disfarce) {
            System.out.println("O heroi " + this.nomeHeroi + " está colocando seu uniforme.");
            this.disfarce = false;
        } else {
            System.out.println("O heroi " + this.nomeHeroi + " está voltando ao seu disfarce de humano.");
            this.disfarce = true;
        }
        System.out.println();
    }

    public void atacar() {
        System.out.println("O heroi " + this.nomeHeroi + " está atacando com um soco.");
        System.out.println();
    }

    public void atacar(int mana) {
        usarMagia(mana);
        System.out.println("O heroi " + this.nomeHeroi + " está atacando com seu poder.");
        System.out.println();
    }

}
