package tdd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class WydarzenieTest {


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
}
