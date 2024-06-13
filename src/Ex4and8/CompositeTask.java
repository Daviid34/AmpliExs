package Ex4and8;

import java.util.*;

public class CompositeTask extends Task implements Observer {
    private Collection<Task> subtasks = new ArrayList<>(); //esto no es asi pero me da palo cambiar

    public void addSubTask(Task t) {
        //Comprovar si creem cicles (x simplificar no ho farem), es a dir que no estem afegint com
        // a subtasca una tasca
        // que no sigui nul·la
        Objects.requireNonNull(t);
        subtasks.add(t);
    }

    public Money costInEuros() {
        var total = new Money(0);
        for (var task : subtasks) {
            total = total.add(task.costInEuros());
        }
        return total;
    }

    public int durationInDays() {
        return subtasks.stream().mapToInt(Task::durationInDays).sum();
    }

    public void update(Observable o, Object arg) {
        if (hasFinished()) {
            setChanged();
            notifyObservers();
        }
    }

    public boolean hasFinished() {
        return subtasks.stream().allMatch(Task::hasFinished);
    }
}
