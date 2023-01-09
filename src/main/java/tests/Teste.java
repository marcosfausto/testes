package tests;

import designPatterns.singleton.Singleton;

public class Teste {

    public static void permutation2(String input){
        permutation1("", input);
    }

    private static void permutation1(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation1(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }

    }

    public static void main(String args[]) {

        permutation2("123");

        Singleton singleton = Singleton.getInstance();

    }






}
