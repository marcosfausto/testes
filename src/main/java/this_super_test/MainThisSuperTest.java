package this_super_test;

public class MainThisSuperTest extends MotherClass {

    public MainThisSuperTest() {
        super("bla");
    }

    public MainThisSuperTest(String bla) {
        System.out.println("bla");
    }

//    public MainThisSuperTest() {
//        this("bla");
//    }

    public static void main(String[] args) {

        MainThisSuperTest mainThisSuperTest = new MainThisSuperTest();

    }

}
