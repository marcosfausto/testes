package loop_test;

public class LoopTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            if (i == 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
