package design_patterns.adapter;

public class MainAdapterTest {
    public static void main(String[] args) {
        Movable ferrari = new Ferrari();
        MovableAdapter ferrariAdapter = new MovableAdapterImpl(ferrari);

        System.out.println("Speed in MPH: " + ferrari.getSpeed());

        System.out.println("Speed in KMH: " + ferrariAdapter.getSpeed());

    }
}
