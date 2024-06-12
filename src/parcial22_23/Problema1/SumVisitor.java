package parcial22_23.Problema1;

import java.util.HashSet;
import java.util.Set;

public class SumVisitor implements Visitor {
    private final Set<Component> visited;
    private int sum;

    private SumVisitor(Set<Component> visited) {
        this.visited = visited;
    }

    public static int sumComponents(Component c) {
        SumVisitor sv = new SumVisitor(new HashSet<>());
        c.accept(sv);
        return sv.sum;
    }

    public void visit(Leaf leaf) {
        if (visited.add(leaf)) sum += leaf.getInfo();
    }

    public void visit(Composite composite) {
        if (visited.add(composite)) {
            composite.getComponents().forEach(component -> component.accept(this));
        }
    }
}
