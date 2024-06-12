package parcial22_23.Problema2;

public abstract class Figure {
    private double x;
    private double y;

    protected Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static FigureBuilder create() {
        return new FigureBuilder();
    }
}

