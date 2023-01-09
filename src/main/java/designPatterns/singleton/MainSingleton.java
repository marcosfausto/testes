package designPatterns.singleton;

import designPatterns.singleton.Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1.equals(s2)) {
            System.out.println("equals");
            System.out.println("s1 hashcode:" + s1.hashCode());
            System.out.println("s2 hashcode:" + s1.hashCode());
        }
    }

}
