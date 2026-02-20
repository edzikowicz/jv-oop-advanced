package core.basesyntax;

public class RightTriangle extends Figure implements AreaObtain{
    private final int firstLeg;
    private final int secondLeg;

    public  RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
