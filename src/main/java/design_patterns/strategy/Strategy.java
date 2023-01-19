package design_patterns.strategy;

import comparator_comparable_test.User;
import comparator_comparable_test.UserComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Strategy {
    public static void main(String[] args) {
        User user1 = new User(3,"Gilmar");
        User user2 = new User(1,"Frederico");
        User user3 = new User(2,"Marcos");

        // One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter.
        // Based on the different implementations of Comparator interfaces,
        // the Objects are getting sorted in different ways.
        List<User> userList1 = new ArrayList<>(Arrays.asList(user1,user2,user3));
        Comparator<User> byId = Comparator.comparing(User::getId);
        userList1.sort(byId);
        System.out.println("Sorted byId: " + userList1);

        List<User> userList2 = new ArrayList<>(Arrays.asList(user1,user2,user3));
        Comparator<User> byNome = Comparator.comparing(User::getNome);
        userList2.sort(byNome);
        System.out.println("Sorted byNome: " + userList2);
    }
}
