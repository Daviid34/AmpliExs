package Ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public abstract class CompositeTask implements Task {
    private Collection<Task> subtasks = new ArrayList<>();

    public void addSubTask(Task t) {
        //Comprovar si creem cicles (x simplificar no ho farem), es a dir que no estem afegint com
        // a subtasca una tasca
        // que no sigui nul·la
        Objects.requireNonNull(t);
        subtasks.add(t);
    }

    @Override
    public Money costInEuros() {
        var total = new Money(0);
        for (var task : subtasks) {
            total = total.add(task.costInEuros());
        }
        return total;
    }

}
