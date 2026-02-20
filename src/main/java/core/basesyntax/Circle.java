package core.basesyntax;

public class Circle extends Figure implements AreaObtain {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }
}
