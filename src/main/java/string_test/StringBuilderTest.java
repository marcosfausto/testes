package string_test;

public class StringBuilderTest {
    public static void main(String[] args) {


        String goku = "oi eu sou o goku!";
         // O String Builder sofre alteraçoes até o final por ser mutável
        StringBuilder stringBuilder = new StringBuilder(goku);

        System.out.println(stringBuilder.append(" e eu tb!"));

        System.out.println(stringBuilder.reverse());





    }
}
