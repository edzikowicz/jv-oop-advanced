package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color, "isosceles trapezoid");
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getArea() {
        double sumOfBases = topBase + bottomBase;
        return (sumOfBases / 2) * height;
    }

    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, top base: "
                + topBase + ", bottom base: " + bottomBase
                + ", height:" + height + ", color: " + getColor();
    }
}
