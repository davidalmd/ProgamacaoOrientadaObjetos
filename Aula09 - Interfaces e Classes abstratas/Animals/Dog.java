import java.util.ArrayList;

public class Dog extends Canine implements Pet {

    public void bark() {
        System.out.println("AU AU");
    }

    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    public void play() {
        System.out.println("Dog is playing");
    }

    public static void main(String[] args) {
        Generics.takeThings(new ArrayList<Animal>());
        Generics.takeThings2(new ArrayList<Dog>());
    }
}
