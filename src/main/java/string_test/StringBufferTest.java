package string_test;

public class StringBufferTest {
    public static void main(String[] args) {
        String goku = "oi eu sou o goku!";

        StringBuffer stringBuffer = new StringBuffer(goku);

        StringBuffer stringBuffer2 = new StringBuffer("oi eu sou o goku!");


        System.out.println(stringBuffer.compareTo(stringBuffer2));


    }
}
