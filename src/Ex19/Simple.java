package Ex19;

public class Simple implements Task{
    private int cost;
    private int duration;
    public Simple (int cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }

    public void accept(TaskVisitor taskVisitor) {
        taskVisitor.visit(this);
    }

    public int getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }
}
