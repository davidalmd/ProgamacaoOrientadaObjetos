public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return this.qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void exibirDados() {
        System.out.println("--- Dados do vendedor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + Double.toString(getSalario()));
        System.out.println("Valor das vendas: " + Double.toString(getValorVendas()));
        System.out.println("Quantidade de vendas: " + Integer.toString(getQtdVendas()) + "\n");
    }
}
