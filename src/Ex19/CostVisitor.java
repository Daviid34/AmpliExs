package Ex19;

import java.util.List;

public class CostVisitor implements TaskVisitor {
    private int cost;
    public static int getCost(Task t) {
        var cv = new CostVisitor();
        t.accept(cv);
        return cv.cost;
    }

    public void visit(Simple simple) {
        cost = simple.getCost();
    }

    public void visit(CompositeTask compositeTask) {
        cost = compositeTask.getTasks().stream().mapToInt(CostVisitor::getCost).sum();
        //Equivalent off:
        List<Task> tasks = compositeTask.getTasks();
        for (Task t : tasks) {
            cost += CostVisitor.getCost(t);
        }
    }
}
