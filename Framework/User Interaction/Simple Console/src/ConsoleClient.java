import java.util.Scanner;

public class ConsoleClient {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Your name: ");
        final String userString = scanner.next();

        System.out.println("Your age: ");
        final int userAge = scanner.nextInt();

        System.out.println("Your weight: ");
        final float userWeight = scanner.nextFloat();

        System.out.println(new UserInformation(userString, userAge, userWeight).printUserInformation());
    }
}