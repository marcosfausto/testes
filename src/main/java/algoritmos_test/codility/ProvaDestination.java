package algoritmos_test.codility;

public class ProvaDestination {
    public static void main(String[] args) {

        destination("NNNE", 1, 1);
    }

    public static boolean destination(String moves, int x, int y) {

        char[] array = moves.toCharArray();

//        Map<String, Integer> map = new HashMap<>();
//        map.put("N", y);
//        map.put("S", -y);
//        map.put("E", x);
//        map.put("W", -x);

        int counterNS = 0;
        int counterEW = 0;

        for (char c : array) {
            switch (String.valueOf(c)) {
                case "N":
                    counterNS++;
                    break;
                case "S":
                    counterNS--;
                    break;
                case "E":
                    counterEW++;
                    break;
                case "W":
                    counterEW--;
                    break;
            }
        }

        System.out.println(counterNS == y && counterEW == x);

        return counterNS == y && counterEW == x;

    }

}

