package hashtable_test;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<>();
        map.put(null,null); // vai provocar null pointer exception
        System.out.println(map);
    }
}
