package parcial22_23.Problema2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    protected Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
}
