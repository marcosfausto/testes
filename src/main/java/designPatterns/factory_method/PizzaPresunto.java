package designPatterns.factory_method;

import designPatterns.factory_method.FactoryMethod;

public class PizzaPresunto extends FactoryMethod {
    @Override
    public void fazPizza() {
        System.out.println("Pizza de Presunto");
    }
}
