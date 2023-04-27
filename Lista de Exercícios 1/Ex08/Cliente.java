public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        if (valorDivida < 0) {
            System.out.println("Valor da dívida inválido!");
        }
        else {
            this.valorDivida = valorDivida;
        }
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento < 0) {
            System.out.println("Ano de nascimento inválido!");
        }
        else {
            this.anoNascimento = anoNascimento;
        }
    }

    public void exibirDados() {
        System.out.println("--- Dados do cliente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade:" + Integer.toString(getIdade()));
        System.out.println("Sexo: " + getSexo());
        System.out.println("Valor da dívida: " + Double.toString(getValorDivida()));
        System.out.println("Ano de nascimento: " + Integer.toString(getAnoNascimento()) + "\n");
    }
}
