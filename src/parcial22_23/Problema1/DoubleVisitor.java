package parcial22_23.Problema1;

public class DoubleVisitor implements Visitor {
    public static void doublesInteger(Component c) {
        DoubleVisitor dv = new DoubleVisitor();
        c.accept(dv);
    }

    public void visit(Leaf leaf) {
        int dobleInt = leaf.getInfo() * 2;
        leaf.setInfo(dobleInt);
    }

    public void visit(Composite composite) {
        composite.getComponents().forEach(component -> component.accept(this));
    }
}
