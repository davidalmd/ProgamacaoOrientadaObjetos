public class TestDrive {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();

        cliente.setNome("Ana");
        cliente.setIdade(17);
        cliente.setSexo("F");
        cliente.setValorDivida(1412.44);
        cliente.setAnoNascimento(2006);

        gerente.setNome("Marcos");
        gerente.setIdade(37);
        gerente.setMatricula("201BS129DG");
        gerente.setNomeGerencia("Principal");
        gerente.setSalario(3210.55);

        vendedor.setNome("João");
        vendedor.setSalario(1230.10);
        vendedor.setValorVendas(1530.78);
        vendedor.setQtdVendas(245);

        cliente.exibirDados();
        gerente.exibirDados();
        vendedor.exibirDados();
    }
}
