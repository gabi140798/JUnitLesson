package pl.kurs.zadanie2;

public class Pracownik {

    private String imie,nazwisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }


    @Override
    public String toString() {
        return String.format("Imię: %s, Nazwisko: %s, Pensja: %s",imie,nazwisko,pensja);
    }
}
