public class Gerente extends Empregado {
    private String nomeGerencia;

    public String getNomeGerencia() {
        return this.nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public void exibirDados() {
        System.out.println("--- Dados do gerente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + Integer.toString(getIdade()));
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome da gerencia: " + getNomeGerencia());
        System.out.println("Valor do INSS: " + Double.toString(valorInss()) + "\n");
    }
}
