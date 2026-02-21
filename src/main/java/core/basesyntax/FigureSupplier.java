package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        switch (figureType) {
            case 0:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE);

            case 1:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + MIN_SIZE);

            case 2:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + MIN_SIZE);

            case 3:
                return new IsoscelesTrapezoid(
                       colorSupplier.getRandomColor(),
                       random.nextInt(MAX_SIZE) + MIN_SIZE, random.nextInt(MAX_SIZE) + MIN_SIZE,
                       random.nextInt(MAX_SIZE) + MIN_SIZE);

            case 4:
                return new RightTriangle(
                       colorSupplier.getRandomColor(),
                       random.nextInt(MAX_SIZE) + MIN_SIZE,
                       random.nextInt(MAX_SIZE) + MIN_SIZE);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
