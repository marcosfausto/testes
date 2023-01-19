package designPatterns.simple_factory;

import designPatterns.factory_method.Homem;
import designPatterns.factory_method.Mulher;

public class SimpleFactory {

    // O simpleFactory não tem herança ou implementaçoes, os métodos ficam na mesma fábrica de objetos

    public Homem fazHomem(String nome) {
        return new Homem(nome);
    }

    public Mulher fazMulher(String nome) {
        return new Mulher(nome);
    }
}
