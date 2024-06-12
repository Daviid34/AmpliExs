package parcial22_23.Problema2;

public class FigureBuilder {
    private double x = Double.NEGATIVE_INFINITY;
    private double y;
    private double width = Double.NEGATIVE_INFINITY;
    private double height;
    private double radius = Double.NEGATIVE_INFINITY;

    public FigureBuilder at(double x, double y) {
        if (x == Double.NEGATIVE_INFINITY) {
            this.x = x;
            this.y = y;
        }
        return this;
    }

    public FigureBuilder withDimensions(double width, double height) {
        if (radius == Double.NEGATIVE_INFINITY) {
            this.height = height;
            this.width = width;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public FigureBuilder withRadius(double radius) {
        if (this.width == Double.NEGATIVE_INFINITY) {
            this.radius = radius;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public Figure execute() {
        if (this.radius == Double.NEGATIVE_INFINITY) {
            return new Rectangle(x, y, width, height);
        } else {
            return new Circle(x, y, radius);
        }
    }
}
