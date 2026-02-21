package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color, "rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, length "
                + length + ", width " + width + ", color: " + getColor();
    }

}
