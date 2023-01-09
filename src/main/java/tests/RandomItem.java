package tests;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomItem {

    public static void main(String[] args) {

        List<String> bla = Arrays.asList("bla","ble","bli","blo","blu");
        int random = new Random().nextInt(bla.size());
        System.out.println(bla.get(random));

    }
}
