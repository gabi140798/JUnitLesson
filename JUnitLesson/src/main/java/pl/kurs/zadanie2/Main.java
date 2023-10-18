package pl.kurs.zadanie2;

public class Main {
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Jan", "Kowalski", 3000.50);
        Pracownik p2 = new Pracownik("Anna", "Nowak", 2500.00);

        Firma firma = new Firma("TechCorp");
        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);

        assert p1.getImie().equals("Jan");
        assert firma.getNazwa().length() == 8;
        assert Math.abs(p1.getPensja() - 3000.50) < 0.01;
        assert firma.getListaPracownikow().size() == 2;
        assert firma.wyplataDlaWszystkichPracownikow() == 5500.50;

    }
}
