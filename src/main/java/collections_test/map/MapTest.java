package collections_test.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> bookMap = new HashMap<>();

        bookMap.put("Robert C. Martin", "Clean Code");
        bookMap.put("Joshua Bloch", "Effective Java");

        // more slow to get the map value
        for (String key : bookMap.keySet()) {
            System.out.println("key: " + key + " value: " + bookMap.get(key));
        }

        // more fast to get map value
        for (Map.Entry<String, String> book: bookMap.entrySet()) {
            System.out.println("key: " + book.getKey() + " value: " + book.getValue());
        }


        Map.Entry<String, Book> tuple = new AbstractMap.SimpleEntry<>("9780134685991", new Book("Effective Java 3d Edition", "Joshua Bloch"));

        List<Map.Entry<String, Book>> orderedTuples = new ArrayList<>();

        orderedTuples.add(new AbstractMap.SimpleEntry<>("9780134685991",
                new Book("Effective Java 3d Edition", "Joshua Bloch")));
        orderedTuples.add(new AbstractMap.SimpleEntry<>("9780132350884",
                new Book("Clean Code","Robert C Martin")));

        orderedTuples.add(new AbstractMap.SimpleEntry<>("9780132350884",
                new Book("Clean Code", "Robert C Martin")));

        for (Map.Entry<String, Book> tp : orderedTuples) {
            System.out.println("key: " + tp.getKey() + " value: " + tp.getValue());
        }



    }
}
