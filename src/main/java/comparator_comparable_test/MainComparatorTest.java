package comparator_comparable_test;

import java.util.*;

public class MainComparatorTest {
    public static void main(String[] args) {
        User user1 = new User(3,"Gilmar");
        User user2 = new User(1,"Frederico");
        User user3 = new User(2,"Marcos");
        UserComparator userComparator = new UserComparator();


        List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3));
        userList.sort(userComparator);
        System.out.println("Sorted by userComparator: " + userList);

        List<User> userList2 = new ArrayList<>(Arrays.asList(user1,user2,user3));
       // Comparator<User> byId = (User x, User y) -> Integer.compare(x.getId(), y.getId());
        Comparator<User> byId = Comparator.comparing(User::getId);
        userList2.sort(byId);
        System.out.println("Sorted byId: " + userList);

        TreeMap<User,String> userStringTreeMap= new TreeMap<>(byId);


        List<User> userList3 = new ArrayList<>(Arrays.asList(user1,user2,user3));
        Comparator<User> byNome = Comparator.comparing(User::getNome);
        userList3.sort(byNome);
        System.out.println("Sorted byNome: " + userList);
        System.out.println(userList);

    }
}
