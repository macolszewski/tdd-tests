package tdd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PoleFiguryTest {




    @Test
    public void czyPoleProstokataPoprawneGdyParametryPoprawne(){
//        given
        int a = 5;
        int b = 6;
//        when
        double result = PoleFigury.poleProstokata(a,b);
//        then
        assertThat(result, is(30.0));
    }

    @Test
    public void czyPoleKadratuPoprawneGdyParametryPoprawne() {
//        given
        int a = 5;
//        when
        double result = PoleFigury.poleKwadratu(a);
//        then
        assertThat(result, is(25.0));
    }

    @Test
    public void czyPoleTrojkataPoprawneGdyParametryPoprawne(){
//        given
        int a = 3;
        int b = 4;
        int c = 5;
//        when
        double result = PoleFigury.poleTrojkata(a,b,c);
//        then
        assertThat(result, is(6.0));
    }

    @Test
    public void czyPoleTrapezuPoprawneGdyParametryPoprawne(){
//        given
        int a = 5;
        int b = 3;
        int h = 3;
//        when
        double result = PoleFigury.poleTrapezu(a,b,h);
//        then
        assertThat(result, is(12.0));
    }

    @Test
    public void czyPoleKolaPoprawneGdyParametryPoprawne(){
//        given
        int r = 3;
//        when
        double result = PoleFigury.poleKola(r);
//        then
        assertThat(result, is(Math.PI*(r*r)));
    }


}
