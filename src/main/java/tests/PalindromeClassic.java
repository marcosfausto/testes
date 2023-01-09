package tests;

public class PalindromeClassic {
    public static void main(String[] args) {

        String bla = "SOS";
        String reverse = "";

        for(int i = bla.length() -1; i >=0; i--){
            reverse = reverse + bla.charAt(i);
        }

        if(bla.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("nao é palindrome");
        }


    }
}
