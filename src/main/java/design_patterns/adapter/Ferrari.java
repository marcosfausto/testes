package design_patterns.adapter;

public class Ferrari implements Movable{
    @Override
    public double getSpeed() {
        return 268; // Miles per hour US pattern
    }
}
