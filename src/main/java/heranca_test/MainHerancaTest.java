package heranca_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassA implements Cloneable{
    public void meuNome() {
        System.out.println("Meu nome é A");
    }

    @Override
    public ClassA clone() {
        try {
            return (ClassA) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class ClassB extends ClassA {
    public void meuNome() {
        System.out.println("Meu nome é B");
    }
}

public class MainHerancaTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        MainHerancaTest.imprimeNome(new ClassA());
        MainHerancaTest.imprimeNome(new ClassB());

        ClassA classA = new ClassA();
        ClassA classA1 = classA.clone();

        System.out.println(classA);
        System.out.println(classA1);


    }

    public static void imprimeNome(ClassA class1) {
        class1.meuNome();
    }
}
