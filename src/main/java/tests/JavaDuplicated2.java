package tests;

import java.util.*;
import java.util.stream.Collectors;

public class JavaDuplicated2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 1, 3);

        Set<Integer> items = new HashSet<>();
        list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet()).forEach(System.out::println);

    }

}