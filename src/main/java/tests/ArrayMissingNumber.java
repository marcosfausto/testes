package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMissingNumber {

    public static void main(String[] args) {

        List<Integer> bla = Arrays.asList(1,2,3,5);

        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i <=5; i++) {
            if(!bla.contains(i)){
                missingNumbers.add(i);
            }
        }

        System.out.println(missingNumbers);

    }

}
