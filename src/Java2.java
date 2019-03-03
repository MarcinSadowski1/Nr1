public class Java2 {
    public static void main(String[] args) {
        Java2 helloWorld1 = new Java2();
//        helloWorld1.printHello();
        helloWorld1.inkrementacjaTest();

    }

    private String gettHelloMessage() {
        return "Hello world";
    }


    private void printHello() {
        System.out.println(gettHelloMessage());

    }

    private void inkrementacjaTest() {
        int i = 0;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(++i);
    }

}
