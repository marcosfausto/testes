package string_test;


import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainStringTest {
    public static void main(String[] args) {
       // Como o objeto String é imutável a String nunca muda mesmo após o replaceAll, substring, replace
       String goku = "oi eu sou o goku!";
       System.out.println(goku.replaceAll("\\s+",""));
       System.out.println(goku.substring(1));
       System.out.println(goku.replace("go","ku"));
        System.out.println(goku.substring(0,1));
    }
}
