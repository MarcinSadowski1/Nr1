public class HelloWorld2 {
    public static void main(String[] args) {
        HelloWorld2 helloWorld1 = new HelloWorld2();
        helloWorld1.printHello();


    }
    private String getHelloMessage(boolean isPolish) {
        if(isPolish) {
            return "Witaj świecie!";
        } else {
            return "Hello world!";

                }
    }
    private void printHello() {
        System.out.println(getHelloMessage(true));
        System.out.println(getHelloMessage(false));



    }

}