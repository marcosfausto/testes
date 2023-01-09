package tests;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] array = {"bla","ble","bli"};
        String[] result = new String[array.length];
        int j = array.length;
        for (String s : array) {
            result[j - 1] = s;
            j--;
        }

        System.out.println(Arrays.toString(result));
    }
}
