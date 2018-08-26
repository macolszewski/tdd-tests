package tdd;

import java.util.LinkedList;
import java.util.List;

public class Wydarzenie {
    private String tytul;
    private List<Uczestnik> listaUczestnikow;

    Wydarzenie (String tytul) throws WydarzenieNullException {
        if (tytul == null) {
            throw new WydarzenieNullException("Nie będziesz miał nulla");
        }
        this.tytul = tytul;
        this.listaUczestnikow = new LinkedList<>();
    }

    public String getTytul() {
        return tytul;
    }

    public List<Uczestnik> getListaUczestnikow() {
        return listaUczestnikow;
    }
}
