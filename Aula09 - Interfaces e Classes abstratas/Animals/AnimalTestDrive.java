public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Hippo hippo = new Hippo();
        list.add(dog);
        list.add(cat);
        list.add(hippo);
    }
}
