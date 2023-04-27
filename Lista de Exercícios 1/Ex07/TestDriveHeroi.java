public class TestDriveHeroi {
    public static void main(String[] args) {
        Heroi superHomem = new Heroi();

        superHomem.setNomeHeroi("Super Homem");
        superHomem.setNomeNormal("Clark Kent");
        superHomem.transformar();
        superHomem.setFraseEfeito("É um pássaro? É um avião? Não! É o Super Homem!");

        superHomem.statusHeroi();

        superHomem.receberDano(40);
        superHomem.usarMagia(30);

        superHomem.statusHeroi();

        superHomem.gritoDeGuerra();

        superHomem.recuperarMagia(10);
        superHomem.recuperarVida(10);

        superHomem.statusHeroi();

        superHomem.voar();

        superHomem.atacar();
        superHomem.atacar(10);

        superHomem.statusHeroi();

        superHomem.uparNivel();

        superHomem.statusHeroi();

    }
}
