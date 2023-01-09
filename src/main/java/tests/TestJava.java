package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestJava {

    String bla = "pudim";
    public static void main(String[] args) {

        new TestJava().blaCode("banana");

    }

    public int square(int x) {
        return x*x;
    }

    public void blaCode (String bla) {
        this.bla = "abacate";
        String x =  bla + " aimoré";
        System.out.println(x);
    }
}
