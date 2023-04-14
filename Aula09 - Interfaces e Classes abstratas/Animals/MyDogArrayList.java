import java.util.ArrayList;

public class MyDogArrayList {
    public static void main(String[] args) {
        ArrayList<Animal> myDogArrayList = new ArrayList<Animal>();

        Dog aDog = new Dog();
        myDogArrayList.add(aDog);

        Animal d = myDogArrayList.get(0);

        ((Dog) d).bark();
    }
}
