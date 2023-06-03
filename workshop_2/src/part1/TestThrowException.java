package part1;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class TestThrowException {

    public static void main(String[] args) {
        int number = 0;
        boolean cont = false;
        do {

            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter the number: ");
                number = scan.nextInt();
                if (number < 1)
                    throw new Exception();
                System.out.println("The number is " + number);
                cont = false;

            } catch (Exception e) {
                System.out.println("The number is invalid\n");
                cont = true;
            }
        } while (cont);
    }
}
