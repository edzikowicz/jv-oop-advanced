package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaObtain {
    private final int topBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(int topBase, int bottomBase, int height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double sumOfBases = topBase + bottomBase;
        return (sumOfBases / 2) * height;
    }
}
