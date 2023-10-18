package pl.kurs.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private String nazwa;
    private List<Pracownik> listaPracownikow = new ArrayList<>();

    public Firma(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajPracownika(Pracownik pracownik) {
        listaPracownikow.add(pracownik);
    }

    public double wyplataDlaWszystkichPracownikow() {
        return listaPracownikow.stream().mapToDouble(Pracownik::getPensja).sum();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Pracownik> getListaPracownikow() {
        return listaPracownikow;
    }

    public void setListaPracownikow(List<Pracownik> listaPracownikow) {
        this.listaPracownikow = listaPracownikow;
    }

    @Override
    public String toString() {
        return String.format("Nazwa: %s",nazwa);
    }
}
