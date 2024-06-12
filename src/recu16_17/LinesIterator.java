package recu16_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinesIterator implements Iterator<String> {
    private final BufferedReader br;
    private String peek;
    public LinesIterator(BufferedReader br) {
        this.br = br;
        peek = null;
    }
    public boolean hasNext() {
        if (peek != null) return true;
        try {
            peek = br.readLine();
            return peek != null;
        } catch (IOException ex) {
            throw new NoSuchElementException();
        }
    }

    public String next() {
        if (peek != null) {
            String res = peek;
            peek = null;
            return res;
        }
        try {
            String next = br.readLine();
            if (next != null) return next;
            throw new NoSuchElementException();
        } catch (IOException ex) {
            throw new NoSuchElementException();
        }
    }
}
