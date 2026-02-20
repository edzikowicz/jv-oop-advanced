package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getArea());

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid( 4,5,6);
        System.out.println(isoscelesTrapezoid.getArea());
    }
}
