package tdd;

import java.util.LinkedList;
import java.util.List;

public class Wydarzenie {
    private String tytul;
    private List<Uczestnik> listaUczestnikow;
    private int liczbaUczestnikow;

    Wydarzenie (String tytul) throws WydarzenieNullException {
        if (tytul == null) {
            throw new WydarzenieNullException("Nie będziesz miał nulla");
        }
        this.tytul = tytul;
        this.listaUczestnikow = new LinkedList<>();
        liczbaUczestnikow=5;
    }

    public int getLiczbaUczestnikow() {
        return liczbaUczestnikow;
    }

    public void setLiczbaUczestnikow(int liczbaUczestnikow) {
        this.liczbaUczestnikow = liczbaUczestnikow;
    }

    public String getTytul() {
        return tytul;
    }

    public List<Uczestnik> getListaUczestnikow() {
        return listaUczestnikow;
    }

    public void dodajUczestnika(Uczestnik uczestnik) throws UczestnikNullException {
        if (uczestnik==null) {
            throw new UczestnikNullException("Uczestnik nie może być nullem");
        }
        this.listaUczestnikow.add(uczestnik);
    }

    public void usunUczestnika(Uczestnik uczestnik) throws UczestnikNullException {
        if (uczestnik==null) {
            throw new UczestnikNullException("Uczestnik nie może być nullem");
        } else {
            Uczestnik doWywalenia = null;
            for (Uczestnik uczestnikWydarzenia : listaUczestnikow ) {
                if (uczestnik.equals(uczestnikWydarzenia)) {
                    doWywalenia = uczestnikWydarzenia;
                }
            }
            listaUczestnikow.remove(doWywalenia);
        }
    }
}
