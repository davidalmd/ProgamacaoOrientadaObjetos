public class TestDriveArvore {
    public static void main(String[] args) {
        Arvore carvalho = new Arvore();

        carvalho.setNome("Carvalho");
        carvalho.setIdade(0);
        carvalho.setIdadeMax(3);
        carvalho.setTamanho(1.5);

        System.out.println("Nome: " + carvalho.getNome());
        System.out.println("Idade: " + carvalho.getIdade());
        System.out.println("Idade Máxima: " + carvalho.getIdadeMax());
        System.out.println("Tamanho: " + carvalho.getTamanho());

        carvalho.addIdade();
        System.out.println("Tamanho: " + carvalho.getTamanho());
        carvalho.addIdade();
        System.out.println("Tamanho: " + carvalho.getTamanho());
        carvalho.addIdade();
        System.out.println("Tamanho: " + carvalho.getTamanho());
        carvalho.addIdade();

        System.out.println("Nome: " + carvalho.getNome());
        System.out.println("Idade: " + carvalho.getIdade());
        System.out.println("Idade Máxima: " + carvalho.getIdadeMax());
        System.out.println("Tamanho: " + carvalho.getTamanho());

    }
}
