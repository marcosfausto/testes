package comparator_comparable_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainComparableTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,1));
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        UserComparable user1 = new UserComparable(3,"Gilmar");
        UserComparable user2 = new UserComparable(1,"Gilmar");
        UserComparable user3 = new UserComparable(2,"Marcos");

        List<UserComparable> userList = new ArrayList<>(Arrays.asList(user1,user2,user3));
        List<UserComparable> sortedUserList = userList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedUserList);
        List<UserComparable> distictList = sortedUserList.stream().distinct().collect(Collectors.toList());
        System.out.println(distictList);

        TreeMap<UserComparable,String> userStringTreeMap= new TreeMap<>();

        ConcurrentHashMap<User,String> concurrentHashMap = new ConcurrentHashMap<>();


    }
}
