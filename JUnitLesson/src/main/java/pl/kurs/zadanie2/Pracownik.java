package pl.kurs.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Pracownik {

    private String imie,nazwisko;
    private double pensja;
    private Firma firma;
    private static List<Pracownik> pracownicy = new ArrayList<>();

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        pracownicy.add(this);
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

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public static List<Pracownik> getPracownicy() {
        return pracownicy;
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
