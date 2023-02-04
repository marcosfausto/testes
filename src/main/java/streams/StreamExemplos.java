package streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum: " + sum);

        Integer reduce = list.stream().reduce(0, Integer::sum);

        System.out.println("reduce: " + reduce);

        boolean anyMatch = list.stream().anyMatch(x -> x > 5);
        boolean allMatch = list.stream().allMatch(x -> x > 5);

        System.out.println("anyMatch: " + anyMatch);
        System.out.println("allMatch: " + allMatch);

        // Receive a parameter and return a boolean
        Predicate<Integer> predicate = x -> x > 8;
        System.out.println("Filter :");
        // filter recebe um predicate : recebe parametros e retorna um boleano
        list.stream().filter(predicate).forEach(System.out::println);

        Optional<Integer> any = list.stream().filter(x -> x > 20).findAny();

        any.ifPresent(System.out::println);

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

        List<Integer> numbers = Arrays.asList(6, 5, 4, 3, 2, 1);
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);

        User user1 = User.builder()
                .id(1)
                .nome("gilmar")
                .build();

        User user2 = User.builder()
                .id(2)
                .nome("felipe")
                .build();

        User user3 = User.builder()
                .id(3)
                .nome("marcos")
                .build();

        List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3));

        Map<String, List<User>> userNomeMap = userList.stream().collect(groupingBy(User::getNome));

        userNomeMap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
        
        int i;
        Integer x = 2;

        System.out.println(x +1);

        boolean bla = result == 21;
        System.out.println(bla);

    }


}
