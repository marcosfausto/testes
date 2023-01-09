package streams;

import java.util.*;

public class SortedTest {
    public static void main(String[] args) {

        // Adding elements to above ArrayList
        User user1 = User.builder()
                .id(123)
                .nome("gilmar")
                .build();

        User user2 = User.builder()
                .id(123)
                .nome("frederico")
                .build();

        List<User> CompanyList = new ArrayList<>(Arrays.asList(user1, user2));

        Comparator<User> com = Comparator.comparing(User::getId);

        CompanyList.sort(com);

        // Sorting the list
        // using sorted() method and
        // printing using for-each loop
        CompanyList.stream().sorted().forEach(
                System.out::println);

    }


}
