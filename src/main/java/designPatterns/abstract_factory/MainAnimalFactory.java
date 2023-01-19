package designPatterns.abstract_factory;

public class MainAnimalFactory {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.create("Dog");
        System.out.println(dog.makeSound());
    }
}
