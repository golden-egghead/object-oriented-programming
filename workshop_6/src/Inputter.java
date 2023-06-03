/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class Inputter {

    public static Scanner scan = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(scan.nextLine());
        } while (data < min || data > max);
        return data;
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        String data = scan.nextLine().trim();
        return data;
    }

    public static String inputNonBlankStr(String msg) {
        String data;
        do {
            System.out.print(msg);
            data = scan.nextLine();
        } while (data.length() == 0);
        return data;
    }

    public static String inputPattern(String msg, String pattern) {
        String data;
        do {
            System.out.print(msg);
            data = scan.nextLine().trim();
        } while (!data.matches(pattern));
        return data;
    }
}
