package design_patterns.adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private final Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMH(double mph) {
        return mph * 1.60934;
    }
}
