package tests;


import java.util.*;
import java.util.stream.Collectors;

public class JavaDuplicated1 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 1, 3};

        int count = 0;

        for(int i = 0;i < numbers.length;i++){
            count = 0;
            for(int j = i + 1;j < numbers.length;j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(numbers[i]);
            }
        }



    }

}