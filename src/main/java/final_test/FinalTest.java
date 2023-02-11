package final_test;

public final class FinalTest {

    private final String xpto;


    public FinalTest(String xpto) {
        this.xpto = xpto; // only for constructor
    }

//    public void setXpto(String xpto) {
//        this.xpto = xpto; // won't work for final variable
//    }

    public String getXpto() {
        return xpto;
    }
}
