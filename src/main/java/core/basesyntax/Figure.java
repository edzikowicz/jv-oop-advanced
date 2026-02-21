package core.basesyntax;

public abstract class Figure implements DrawFigure, AreaCalculator {
    final private String color;
    final private String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public abstract String draw();

}
