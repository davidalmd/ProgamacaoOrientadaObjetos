import java.util.ArrayList;

public class Generics {
    public static <T extends Animal> void takeThings (ArrayList<T> list) {
        System.out.println("generics");
    }

    public static void takeThings2 (ArrayList<? extends Animal> list) {
        System.out.println("generics");
    }
}
