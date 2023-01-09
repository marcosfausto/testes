package lambda_test;

public class MainLambdaTest {
    public static void main(String[] args) {
        Foo foo = parameter -> parameter + " from lambda";
        UseFoo useFoo = new UseFoo();
        String result = useFoo.add("Message", foo);
        System.out.println(result);
    }
}
