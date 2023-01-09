package designPatterns.simple_factory;

import designPatterns.factory_method.Pizza4queijos;
import designPatterns.factory_method.PizzaPresunto;

public class SimpleFactory {

    // O simpleFactory não tem herança ou implementaçoes, os métodos ficam na mesma fábrica de objetos

    public Pizza4queijos fazPizza4queijos() {
        return new Pizza4queijos();
    }

    public PizzaPresunto fazPizzaPresunto() {
        return new PizzaPresunto();
    }
}
