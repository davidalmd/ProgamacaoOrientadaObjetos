public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
        else {
            System.out.println("Salário inválido!");
        }
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss() {
        return this.salario * 0.11;
    }
}
