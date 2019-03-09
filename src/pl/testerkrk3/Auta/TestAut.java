package pl.testerkrk3.Auta;

import pl.testerkrk3.Auta.modele.BmwM3;


public class TestAut {
    public static void main(String[] args) {
        BmwM3 autoZony = new BmwM3("Auto żony");
        BmwM3 autoCorki = new BmwM3("Auto córki");

        System.out.println(autoZony.getIdentyfikator());
        System.out.println(autoCorki.getIdentyfikator());

    }
}
