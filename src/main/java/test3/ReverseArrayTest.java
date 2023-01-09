package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayTest {
    public static void main(String[] args) {
        Integer[] array = { 1,2,3,4,5,6 };

        List<Object> list = new ArrayList<>(Arrays.asList(array));

        Collections.reverse(list);

        System.out.println(list);


    }
}
