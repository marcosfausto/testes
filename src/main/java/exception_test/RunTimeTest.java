package exception_test;

public class RunTimeTest {
    public static void main(String[] args) {
        bla();
    }

    public static void bla() {
        throw new RuntimeException();
    }
}
