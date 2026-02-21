package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color,int firstLeg, int secondLeg) {
        super(color, "right triangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg + ", color: " + getColor();
    }
}
