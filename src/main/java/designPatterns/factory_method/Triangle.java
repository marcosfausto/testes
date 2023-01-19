package designPatterns.factory_method;

public class Triangle implements Polygon{
    @Override
    public String getType() {
        return "triangle";
    }
}
