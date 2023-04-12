import java.util.Scanner;

class Equacao {
    private int a, b, c;
    private double delta, x1, x2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    private void setDelta(double delta) {
        this.delta = delta;
    }

    public double getDelta() {
        return delta;
    }

    public void calculaDelta(int a, int b, int c) {
        delta = b * b - 4 * a * c;
        setDelta(delta);
    }

    public void calculaRaizes(int a, int b, double delta) {
        if (delta < 0) {
            System.out.println("Não existe raiz real");
        }
        else if (a != 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("Não é uma equação de segundo grau, pois a = 0");
        }
    }
}

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Equacao equacao = new Equacao();
        System.out.print("Digite o valor de a: ");
        equacao.setA(input.nextInt());
        System.out.print("Digite o valor de b: ");
        equacao.setB(input.nextInt());
        System.out.print("Digite o valor de c: ");
        equacao.setC(input.nextInt());

        equacao.calculaDelta(equacao.getA(), equacao.getB(), equacao.getC());
        equacao.calculaRaizes(equacao.getA(), equacao.getB(), equacao.getDelta());

        input.close();
    }    
}
