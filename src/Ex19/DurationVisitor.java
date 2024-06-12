package Ex19;

import java.util.HashSet;
import java.util.Set;

public class DurationVisitor implements TaskVisitor {
    private int duration;
    private final Set<Task> visited;

    private DurationVisitor(Set<Task> visited) {
        this.visited = visited;
    }

    public static int getDuration(Task t) {
        var dv = new DurationVisitor(new HashSet<>());
        t.accept(dv);
        return dv.duration;
    }

    public void visit(Simple simple) {
        if (visited.add(simple)) {
            duration = simple.getDuration();
        }
    }

    public void visit(CompositeTask compositeTask) {
        if (visited.add(compositeTask)) {
            duration = compositeTask.getTasks().stream().mapToInt(DurationVisitor::getDuration).sum();
        }
    }
}
