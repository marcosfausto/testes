package tests;

public class Palindrome {


    public static void main(String[] args) {

        Integer bla = 101;

        StringBuilder ble = new StringBuilder(String.valueOf(bla));

        ble.reverse();

        if(bla.equals(Integer.valueOf(ble.toString()))){
            System.out.println("palindrome");
        }

    }

}
