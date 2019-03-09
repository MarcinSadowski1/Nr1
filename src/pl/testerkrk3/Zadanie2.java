package pl.testerkrk3;

import java.util.Scanner;

public class Zadanie2 {
    private static Zadanie2 zadanie = new Zadanie2();
    private int licznik = 1;

    public static void main(String[] args) {
        zadanie.wczytajCyfry();
    }

    private void wczytajCyfry() {
        int cyfra = zadanie.czytajWejscie();
        System.out.println("==>" + licznik);
        zadanie.sprawdzCyfry(cyfra);

        if (licznik < 5) {
            licznik++;
            wczytajCyfry();
        }

    }

    private int czytajWejscie() {
        System.out.println("podaj cyfrę");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return Integer.parseInt(scanner.nextLine());
        } else {
            return -1;
        }
    }

    private void sprawdzCyfry(int cyfra) {
        if (cyfra >= 0 && cyfra <= 9) {
            switch (cyfra) {
                case 3:
                case 5:
                    System.out.println("cyfra specjalna ");
                    break;
                default:
                    System.out.println("cyfra zwyczajna");
            }
        } else {
            System.out.println("cyfra poza zakresem");
        }
    }
}