package comparator_comparable_test;

import java.util.*;

public class MainComparatorTest {
    public static void main(String[] args) {
        User user1 = new User(3,"Felipa","F");
        User user2 = new User(5,"Frederico","M");
        User user3 = new User(2,"Marcos","M");
        User user4 = new User(4,"Felipa","F");
        User user5 = new User(1,"Felipa","M");
        UserComparator userComparator = new UserComparator();


        List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));
        userList.sort(userComparator);
        System.out.println("Sorted by userComparator: " + userList);

        List<User> userList2 = new ArrayList<>(Arrays.asList(user1,user2,user3));
       // Comparator<User> byId = (User x, User y) -> Integer.compare(x.getId(), y.getId());
        Comparator<User> byId = Comparator.comparing(User::getId);
        userList2.sort(byId);
        System.out.println("Sorted byId: " + userList);

        List<User> userList3 = new ArrayList<>(Arrays.asList(user1,user2,user3));
        Comparator<User> byAll = Comparator.comparing(User::getNome)
                .thenComparing(User::getSexo)
                .thenComparingInt(User::getId);
        userList3.sort(byAll);
        System.out.println("Sorted by Nome, then Sex, Then ID: " + userList);
        System.out.println(userList);

    }
}
