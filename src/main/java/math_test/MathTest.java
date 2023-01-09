package math_test;

public class MathTest {
    public static void main(String[] args) {

        exercicio1();
    }



    public static void exercicio1() {
// initialize fraction 1
        Fractions f1 = new Fractions(2, 5);

        // initialize fraction 2
        Fractions f2 = new Fractions(6, 5);

        // initialize fraction 3
        Fractions f3 = new Fractions(1, 4);

        // initialize fraction 4
        Fractions f4 = new Fractions(1, 5);

        // Add fractions 1 and 2
        Fractions f5 = f1.add(f2);
//
//        // Add fractions 3 and 4
//        Fractions f6 = f3.add(f4);
//
//        // Add fractions 5 and 6
//        Fractions f7 = f5.add(f6);

        // Print the result
        f5.print();
    }


}
