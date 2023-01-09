package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExemplos {
    public static void main(String[] args) {

        // Function receives a parameter and return something
        Function<Integer,Integer> function = x -> x * 3;
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Consumer receives a parameter and return nothing
        Consumer<Integer> consumer = System.out::println;

        System.out.println("Map :");
        // map recebe uma function
        list.stream().map(function).forEach(consumer);

        // Receive a parameter and return a boolean
        Predicate<Integer> predicate = x -> x > 8;
        System.out.println("Filter :");
        // filter recebe um predicate : recebe parametros e retorna um boleano
        list.stream().filter(predicate).forEach(System.out::println);



        Optional<Integer> findFirst = list.stream()
                .filter(number -> number > 5)
                .findFirst();

        System.out.println("Find First :");

        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        } else {
            System.out.println("no value?");
        }

        Optional<Integer> findAny = list.stream()
                .filter(number -> number > 5)
                .findAny();

        System.out.println("Find Any :");

        if (findAny.isPresent()) {
            System.out.println(findAny.get());
        } else {
            System.out.println("no value?");
        }

        // Creating an empty Arraylist
        List<String> CompanyList = new ArrayList<>();

        // Adding elements to above ArrayList
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");

        // Sorting the list
        // using sorted() method and
        // printing using for-each loop
        CompanyList.stream().sorted().forEach(
                System.out::println);

        // does not receive a parameter and return something
        Supplier<String> supplier = () -> "bla";
        System.out.println(supplier.get());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        boolean bla = result == 21;
        System.out.println(bla);

    }


}
