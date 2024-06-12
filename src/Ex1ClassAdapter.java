import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex1ClassAdapter extends StringTokenizer implements Iterator<Object> {
    public Ex1ClassAdapter(String str, String delim, boolean returnDelims) {
        super(str, delim, returnDelims);
    }

    public Ex1ClassAdapter(String str, String delim) {
        super(str, delim);
    }

    public Ex1ClassAdapter(String str) {
        super(str);
    }

    @Override
    public boolean hasNext() {
        return super.hasMoreElements();
    }

    @Override
    public Object next() {
        return super.nextElement();
    }
}
