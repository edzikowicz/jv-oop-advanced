package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color, "square");
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side " + side + ", color: " + getColor();
    }
}
