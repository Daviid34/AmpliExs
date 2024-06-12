package parcial22_23.Problema1;

public interface Visitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
