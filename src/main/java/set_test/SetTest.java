package set_test;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        List<Integer> nums  = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));

        Set<Integer> hashSet = new HashSet<>(nums);
        System.out.println("hashset: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(nums);
        System.out.println("linkedHashSet: " + linkedHashSet);

        Set<UserSetTest> treeSet = new TreeSet<>(Comparator.comparing(UserSetTest::getId));
        // mandatory to have a comparator if is not possible to sort by natural order
        treeSet.add(UserSetTest.builder().id(1).build());
        treeSet.add(UserSetTest.builder().id(2).build());
        treeSet.add(UserSetTest.builder().id(3).build());
        treeSet.add(UserSetTest.builder().id(4).build());
        //treeSet.add(null); // null pointer will be thrown


        System.out.println("treeSet" + treeSet);

    }
}
