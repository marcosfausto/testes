package enum_test;

public class MainEnumTest {
    static Level levelHigh;

    public static void main(String[] args) {

        System.out.println(levelSwitchCase());

    }

    public static String levelSwitchCase() {

        if(levelHigh == Level.HIGH) { // não toma null pointer exception e é mais rapido na hora da compilação e do run time
            System.out.println("sou iqual");
        }

        levelHigh = Level.LOW;

        switch (levelHigh) {
            case HIGH:
                return "BLA";
            default:
                return "ble";
        }
    }
}
