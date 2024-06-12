package parcial22_23.Problema1;

public class Leaf implements Component {
    private int num;
    public Leaf(int num) {
        this.num = num;
    }

    public int getInfo() {
        return num;
    }

    public void setInfo(int info) {
        num = info;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
