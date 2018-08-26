package tdd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class WydarzenieTest {
    static Wydarzenie wydarzenie;


    @BeforeClass
    public static void noweWydarzenie() throws WydarzenieNullException {
         WydarzenieTest.wydarzenie = new Wydarzenie("Testowe");
    }


    @Test
    public void czyUtworzenieWydarzeniaGdyParamatryPoprawne() throws WydarzenieNullException {
//        given
        String tytul = "testowy";
//        when
        Wydarzenie result = new Wydarzenie(tytul);
//        then
        assertThat(result.getTytul(), equalTo(tytul));

    }

    @Test(expected = WydarzenieNullException.class)
    public void czyBladGdyParameryNull() throws WydarzenieNullException {
//        given
        String tytul = null;
//        when - then
        Wydarzenie result = new Wydarzenie(tytul);
    }

    @Test
    public void czyMetodaDodaniaNowegoUczestnikaDoWydarzeniaDziala() throws UczestnikNullException {
//        given
        Uczestnik testowy = new Uczestnik("test","testowy");

//        when
        WydarzenieTest.wydarzenie.dodajUczestnika(testowy);
//        then
        assertThat(WydarzenieTest.wydarzenie.getListaUczestnikow().get(0), equalTo(testowy));
    }

    @Test(expected = UczestnikNullException.class)
    public void czyMetodaDodaniaNowegoUczestnikaNullDoWydarzeniaBlad () throws UczestnikNullException {
//        given
        Uczestnik testowy = null;
//        when - then
        WydarzenieTest.wydarzenie.dodajUczestnika(testowy);
    }

    @Test
    public void czyMoznaUstalicIloscOsobWWydarzeniu() {
//        given
        int iloscOsob = 10;
//        when
        WydarzenieTest.wydarzenie.setLiczbaUczestnikow(iloscOsob);
//        then
        assertThat(WydarzenieTest.wydarzenie.getLiczbaUczestnikow(), is(iloscOsob));
    }

    @Test
    public void czyMoznaUsunacUczestnikaZListyUczestnikow() throws UczestnikNullException {
//        given
        Uczestnik testowy = new Uczestnik("Test","Testowy");
//        when
        WydarzenieTest.wydarzenie.dodajUczestnika(testowy);
        WydarzenieTest.wydarzenie.usunUczestnika(testowy);
//        then
        assertThat(wydarzenie.getListaUczestnikow(), not(contains(testowy)));

    }
}
