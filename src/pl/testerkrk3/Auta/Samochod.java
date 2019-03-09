package pl.testerkrk3.Auta;

public class Samochod {
    String identyfikator;
    int jazdyCounter = 0;
    int postojeCounter = 0;
    int skretyCounter = 0;

    public Samochod(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public void jedź() {
        jazdyCounter++;

    }

    public void stój() {
        postojeCounter++;

    }

    public void skręć() {
        skretyCounter++;

    }

    void zatankuj() {
    }

    public String getIdentyfikator() {
        return identyfikator;

    }

    String model() {
        return "model nieznany";
    }


}

