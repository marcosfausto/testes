package casting_test;

public class MainAnimalTest {
    public static void main(String[] args) {
        // Upcasting, automatically done by the compiler
        Cat cat = new Cat();
        Animal animal = (Animal) cat;
    }
}
