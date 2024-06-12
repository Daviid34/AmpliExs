package parcial22_23.Problema1;

public class Main {
    public static void main(String[] args) {
        Composite c = new Composite();
        Leaf leaf1 = new Leaf(10);
        Leaf leaf2 = new Leaf(20);
        Composite c2 = new Composite();
        Leaf leaf3 = new Leaf(30);
        Leaf leaf4 = new Leaf(40);
        c.addComponent(leaf1);
        c.addComponent(leaf2);
        c2.addComponent(leaf3);
        c2.addComponent(leaf4);
        c.addComponent(c2);
        DoubleVisitor.doublesInteger(c);
        System.out.println(leaf1.getInfo());
        System.out.println(leaf2.getInfo());
        System.out.println(leaf3.getInfo());
        System.out.println(leaf4.getInfo());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        c2.addComponent(c);
        int sum = SumVisitor.sumComponents(c);
        System.out.println(sum);
    }
}
