import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        HelloWorld2 helloWorld1 = new HelloWorld2();
        helloWorld1.printHello();
    }

    private String getHelloMessage(int jezyk) {
        if (jezyk == 0) {
            return "Witaj Świecie!";
        } else if (jezyk == 1) {
            return "Hello world!";
        } else {
            return "Język nieznany!";

        }
    }

    private String getHelloMessageSwitch(String jezyk) {
        String powitanie = "abc";
        switch (jezyk) {
            case "pl":
                powitanie = "Witaj Świecie";
                break;

            case "en":
                powitanie = "Hello world";
                break;
            case "cs":
                powitanie = "cos";
                break;

            default:
                powitanie = "Jezyk nieznany";
        }
        return powitanie;
    }

    private boolean powitanieDluzszeNiz3(String powitanie) {
        String komunkat = (powitanie.length() > 3) ?
                "wieksze" : "Mniejsze";

        System.out.println(komunkat);

        return powitanie.length() > 3;
    }


    private void printHello() {
        System.out.println("Prosze podaj slowo");
        String wartoscUzytkowinika = new Scanner(System.in).nextLine();

        if (powitanieDluzszeNiz3(wartoscUzytkowinika)) {
            System.out.println("Twoje slowo jest dluzsze niz 3");

        } else {
            System.out.println("Twoje slowo jest krutsze niz 3");


        }


//        System.out.println(getHelloMessageSwitch("en"));
//        System.out.println(getHelloMessageSwitch("cs"));
//        System.out.println(getHelloMessageSwitch("pl"));
//        System.out.println(getHelloMessageSwitch("de3"));

    }
}