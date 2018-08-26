package tdd;

public class Uczestnik {
    private String imie;
    private String nazwisko;

    Uczestnik(String imie, String nazwisko) throws UczestnikNullException {
        if (imie == null || nazwisko == null) {
            throw new UczestnikNullException("Nie będziesz miał nulli przede mną!");
        } else {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
