package pl.kurs.zadanie3;


public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji, liczbaDrzwi;
    private double przebieg;

    public Samochod(String marka, String model, int rokProdukcji, int liczbaDrzwi, double przebieg) {
        if (rokProdukcji > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Rok produkcji nie może być w przyszłości!");
        }
        if ("Lamborghini".equalsIgnoreCase(marka) && liczbaDrzwi != 2) {
            throw new IllegalArgumentException("Lamborghini musi mieć 2 drzwi!");
        }
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.liczbaDrzwi = liczbaDrzwi;
        this.przebieg = przebieg;
    }

    public void zmniejszPrzebieg(double wartosc) {
        if (wartosc < 0 || wartosc > this.przebieg) {
            throw new IllegalArgumentException("Wartość zmniejszana nie może być większa niż przebieg!");
        }
        this.przebieg -= wartosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return String.format("Marka: %s, Model: %s, Rok produkcji: %s, Liczba drzwi: %s, Przebieg: %s",marka,marka, rokProdukcji,liczbaDrzwi,przebieg);
    }
}
