package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color, "circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, top radius: " + radius + ", color: " + getColor();
    }
}
