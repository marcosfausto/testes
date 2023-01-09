package tests;

import java.util.ArrayList;
import java.util.List;

public class Teste3 extends Teste2 {
    public String Teste3(String bla){
        return bla;
    }

    public static String bla(String ble){
        return ble;
    }

    public static String bla(String ble,String bla){
        return ble+bla;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Teste3.bla("bla"));
        System.out.println(Teste3.bla("ble","bla"));

        Teste2 teste1 = new Teste3();
        Teste2 teste2 = new Teste4();

        List<Teste2> bla = new ArrayList<>();

        bla.add(teste1);
        bla.add(teste2);

    }
}
