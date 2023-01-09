package tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCount {
    public static void main(String[] args) {

        List<Integer> bla = Arrays.asList(1,2,3,4,2,3,2);

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i: bla) {
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i,count + 1);
            } else {
                map.put(i,1);
            }
        }

        System.out.println(map);


    }
}
