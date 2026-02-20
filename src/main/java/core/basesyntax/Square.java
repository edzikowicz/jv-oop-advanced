package core.basesyntax;

public class Square extends Figure implements AreaObtain {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
