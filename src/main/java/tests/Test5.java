package tests;

import java.util.*;

public class Test5 implements TesteInterface {
    public static void main(String[] args) {

        List<String> bla = new ArrayList<>();

        bla.add("bla");
        bla.add("ble");
        bla.add("bli");

        Set<String> blaSet = Set.of("bla","ble","bli");
        System.out.println(bla);
        System.out.println(blaSet);

    }
}
