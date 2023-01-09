package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamMap {

    public static void main(String[] args) {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);

    }


}
