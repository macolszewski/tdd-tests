package tdd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class UczestnikTest {


    @Test
    public void czyUzytkownikUtworzySieGdyParametryPoprawne() throws UczestnikNullException {
//        given
        String imie = "Jan";
        String nazwisko = "Kowalski";
//        when
        Uczestnik reslut = new Uczestnik(imie, nazwisko);
//        then
        assertThat(reslut.getImie(), equalTo(imie));
        assertThat(reslut.getNazwisko(), equalTo(nazwisko));
    }

    @Test(expected = UczestnikNullException.class)
    public void czyBladGdyParametryUzytkownikaNull() throws UczestnikNullException {
//        given
        String imie = null;
        String nazwisko = null;
//        when - then
        Uczestnik result = new Uczestnik(imie,nazwisko);

    }
}
