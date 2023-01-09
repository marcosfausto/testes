package heranca_test;

public class Apple implements Fruit{
    @Override
    public Fruit makeFruit() {
        return new Apple();
    }
}
