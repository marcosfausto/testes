package heranca_test;

public class Orange implements Fruit{
    @Override
    public Fruit makeFruit() {
        return new Orange();
    }
}
