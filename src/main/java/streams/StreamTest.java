package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
       String prefix = "Maxi";
       List<String> animals = new ArrayList<>();
       animals.add("Cat");
       animals.add("Dog");
       prefix = "Ultra";
     //  animals.stream().forEach(animal -> System.out.println(prefix + animal)); // compilation error
    }
}
