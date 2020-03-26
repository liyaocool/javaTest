package lambdaTest;

import java.util.Optional;

public class LambdaDemo {
    @FunctionalInterface
    interface Printer {
        String print(String val);
    }

    public void printSomething(String sth, Printer printer) {
        System.out.println(printer.print(sth));
    }



    public static void main(String[] args) {
        LambdaDemo demo = new LambdaDemo();
        String sth = null;
        String newSth = Optional.ofNullable(sth).orElse("hahaha");
        System.out.println(newSth);
        demo.printSomething(newSth, s -> s + 1);
    }
}