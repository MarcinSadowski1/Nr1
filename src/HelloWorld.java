public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld1 = new HelloWorld();
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



