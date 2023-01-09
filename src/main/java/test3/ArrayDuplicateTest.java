package test3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDuplicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 1, 3);
        Set<Integer> itens = new HashSet<>();

        list.stream().filter(i -> !itens.add(i)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
