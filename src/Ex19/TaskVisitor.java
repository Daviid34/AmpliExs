package Ex19;

public interface TaskVisitor {
    void visit(Simple simple);
    void visit(CompositeTask compositeTask);
}
