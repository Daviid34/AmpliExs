package parcial22_23.Problema2;

public class Main {
    public static void main(String[] args) {
        Circle circle = (Circle) Figure.create().at(20,10).withRadius(10).execute();
        Rectangle rectangle = (Rectangle) Figure.create().at(1, 20).withDimensions(1,2).execute();
    }
}
