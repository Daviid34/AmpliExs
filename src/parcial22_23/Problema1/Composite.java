package parcial22_23.Problema1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Composite implements Component {
    private final List<Component> componentList;

    public Composite () {
        this.componentList = new ArrayList<>();
    }

    public void addComponent(Component c) {
        Objects.requireNonNull(c);
        componentList.add(c);
    }

    public List<Component> getComponents() {
        return Collections.unmodifiableList(componentList);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
