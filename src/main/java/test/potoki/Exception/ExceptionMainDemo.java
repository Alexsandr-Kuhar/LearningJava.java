package main.java.test.potoki.Exception;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimplThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
