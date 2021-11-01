public class Main {

    public static void main(String[] args) {
        exampleCodeOne();
        exampleCodeTwo();
    }

    public static void exampleCodeOne() {
        int a = 10;
        long b = 10;
        final String sum = a + " + " + b + " = " + (a + b);
        System.out.println("Example First: " + sum);
    }

    public static void exampleCodeTwo() {
        int a = 10;
        long b = 5;
        final String sum = a + " - " + b + " = " + (a - b);
        System.out.println("Example Second: " + sum);
    }
}