package designPatterns.abstract_factory;

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if(animalType.equalsIgnoreCase("Duck")) {
            return new Duck();
        } else if (animalType.equalsIgnoreCase("Dog")) {
            return new Dog();
        }
        throw new RuntimeException("Animal : " + animalType + " not yet implemented");
    }
}
