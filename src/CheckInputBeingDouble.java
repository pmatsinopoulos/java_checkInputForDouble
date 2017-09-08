import java.util.Scanner;

/**
 * Checks whether input given is a double. It uses the {@link Scanner#hasNextDouble()} method.
 * 
 * @author panayotismatsinopoulos
 *
 */
public class CheckInputBeingDouble {
    public static void main(String[] args) {
        // ask for a double
        System.out.print("Give me a double number: ");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()) {
            String word = scanner.next();
            System.err.println("word : " + word + " is not a double!");
        }
        else {
            Double d = scanner.nextDouble();
            System.out.printf("Double given is: %f\n", d);
        }
        scanner.close();
    }
}
