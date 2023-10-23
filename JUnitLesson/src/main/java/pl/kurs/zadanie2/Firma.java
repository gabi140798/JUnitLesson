package pl.kurs.zadanie2;

import java.util.*;

public class Firma {

    private String nazwa;
    private List<Pracownik> listaPracownikow = new ArrayList<>();

    public Firma(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajPracownika(Pracownik pracownik) {
        if(pracownik.getFirma()!=null){
            throw new IllegalArgumentException("Pracownik ma firmę!");
        }
        listaPracownikow.add(pracownik);
        pracownik.setFirma(this);
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
