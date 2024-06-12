package Ex19;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompositeTask implements Task{
    private final List<Task> tasks;

    public CompositeTask() {
        this.tasks = new ArrayList<>();
    }

    public void addTasks(Task task) {
        Objects.requireNonNull(task);
        tasks.add(task);
    }

    public void accept(TaskVisitor taskVisitor) {
        taskVisitor.visit(this);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
