package functional_test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalTest {
    public static void main(String[] args) {

        binaryOperatorTest();

    }

    public void functionTest() {
        // Function – it takes one argument and returns a result
        Function<Integer,String> function = x -> "y";
        Function<String,Integer> function2 = x -> 1;
        Function<Integer,Integer> function3 = x -> x + 1;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Square each number using a lambda expression:
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer number = stringToInteger.apply("123"); // Number will be 123

        Function<Integer, String> integerToString = String::valueOf;
        String string = integerToString.apply(456); // String will be "456"

        Function<Integer, String> addPrefix = number2 -> "Number: " + number2;
        Function<String, String> makeUppercase = String::toUpperCase;

        Function<Integer, String> combinedFunction = addPrefix.andThen(makeUppercase);
        String result = combinedFunction.apply(5); // Result will be "NUMBER: 5"
    }

    // Consumer – it takes one argument and returns no result (represents a side effect)
    public void consumerTest() {
        Consumer<String> consumer = System.out::println;
        Consumer<List<Integer>> consumer2 = list -> list.replaceAll(x -> 2 * x);

        // Increment each number by 5:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> incrementer = number1 -> number1 += 5;
        numbers.forEach(incrementer);

        // Double each number (using Consumer's `andThen` method):
        Consumer<Integer> doubler = number2 -> number2 *= 2;
        numbers.forEach(incrementer.andThen(doubler));

    }

    // Supplier – it takes no arguments and returns a result
    public void supplierTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Supplier<String> supplier = () -> "shawblaw!";
        Supplier<Integer> supplier2 = () -> 1;

        // Define a Supplier that generates a random integer between 1 and 100:
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100) + 1;
        // Create an infinite stream of random numbers:
        Stream<Integer> randomNumbers = Stream.generate(randomNumberSupplier);
        ;
    }

    // Predicate – it takes one argument and returns a boolean
    public void predicateTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);        // Filter even numbers:
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        // Print the even numbers:
        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]

        Predicate<String> isLongerThanFive = str -> str.length() > 5;
        System.out.println(isLongerThanFive.test("Hello"));   // true
        System.out.println(isLongerThanFive.test("World"));   // false

        Predicate<Integer> isGreaterThanTen = number -> number > 10;
        Predicate<Integer> isLessThanTwenty = number -> number < 20;

        Predicate<Integer> isLessThanFive = number -> number < 5;
        Predicate<Integer> isGreaterThanFifteen = number -> number < 15;

        // Numbers between 10 and 20 (exclusive):
        Predicate<Integer> betweenTenAndTwenty = isGreaterThanTen.and(isLessThanTwenty);

        // Numbers that are either less than 5 or greater than 15:
        Predicate<Integer> outsideRange = isLessThanFive.or(isGreaterThanFifteen);

        Predicate<Integer> isGreaterThanFive = number -> number > 5;

        // Find the first even number greater than 5:
        Optional<Integer> firstEvenGreaterThanFive = numbers.stream()
                .filter(isEven.and(isGreaterThanFive))
                .findFirst();
    }

    // BiFunction it takes two arguments and returns a result
    public void biFunctionTest() {
        BiFunction<Integer, Integer, Double> adder = (a, b) -> Double.valueOf(a + b);
        double result = adder.apply(3, 5); // result = 8.0

        BiFunction<String, String, String> fullName = (firstName, lastName) -> firstName + " " + lastName;
        String name = fullName.apply("John", "Doe"); // name = "John Doe"

        BiFunction<Integer, Boolean, String> gradeMessage = (score, passed) ->
                passed ? "Congratulations! You passed with a score of " + score : "Keep practicing!";
        String message = gradeMessage.apply(75, true); // message = "Congratulations! You passed with a score of 75"

    }

    // BinaryOperator – it is similar to a BiFunction, taking two arguments and returning a result. The two arguments and the result are all of the same types.
    public static void binaryOperatorTest() {

        BinaryOperator<Integer> adder = Integer::sum;
        double result = adder.apply(3, 5); // result = 8.0

        System.out.println(result);

        BinaryOperator<String> fullName = (firstName, lastName) -> firstName + " " + lastName;
        String name = fullName.apply("John", "Doe"); // name = "John Doe"

        System.out.println(name);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use BinaryOperator with reduce to find the sum
        int sum = numbers.stream()
                .reduce(0, (BinaryOperator<Integer>) Integer::sum);

        System.out.println(sum); // Output: 15

    }

    // UnaryOperator – it is similar to a Function, taking a single argument and returning a result of the same type
    public void unaryOperatorTest() {
        UnaryOperator<Integer> function = x -> 1;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        String text = "hello world";

        // Use UnaryOperator to convert to uppercase
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        String upperText = toUpperCase.apply(text);

        System.out.println(upperText); // Output: HELLO WORLD

        double number = 16;

        // Use UnaryOperator to find the square root
        UnaryOperator<Double> squareRoot = Math::sqrt;
        double root = squareRoot.apply(number);

        System.out.println(root); // Output: 4.0



    }

}
