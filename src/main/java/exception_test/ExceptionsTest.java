package exception_test;

public class ExceptionsTest {
    public static void main(String[] args) {
        bla();
    }

    public static void bla() {
        try {
            bla();
        } catch (StackOverflowError e){
            System.out.println("erro stack");
        }
        System.out.println("ble");

    }
}
