import java.util.Enumeration;
import java.util.Iterator;

public class Ex1ObjectAdapter<E> implements Iterator<E> {
    /*Per no violar el principi de segregació d'interfícies, en lloc d'utilitzar
    * StringTokenizer, utilitzar la class Enumeration<Object>.
    * Si es vol generalitzar més, canviar Object per generics,  és a dir, ficar <E>*/
    private final Enumeration<E> enumeration;
    public Ex1ObjectAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public E next() {
        return enumeration.nextElement();
    }
}