package static_test;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class FilhaStatic extends MaeStatic{

    public static void main(String[] args) {
        MaeStatic.bla();

        Hashtable<String,String> hashtable = new Hashtable<>();
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
    }

}
