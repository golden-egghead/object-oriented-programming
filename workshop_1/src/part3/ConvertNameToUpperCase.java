package part3;

/**
 *
 * @author Tin
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class ConvertNameToUpperCase {

    public static void main(String[] args) {
        String[] listStudent = new String[1];
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Stundents:");
        for (int i = 0; i < 1; i++) {
            listStudent[i] = scan.nextLine().replaceAll("\\s+", " ").trim();
            String[] toUpper = listStudent[i].split("\\s");
            int length = toUpper.length;
            String student = "";
            for (int j = 0; j < length; j++) {
                String firstLetter = toUpper[j].substring(0, 1);
                String wordBehind = toUpper[j].substring(1, toUpper[j].length());
                firstLetter = firstLetter.toUpperCase();
                toUpper[j] = firstLetter.concat(wordBehind);
                student = student.concat(" " + toUpper[j]);
            }
            listStudent[i] = student.trim();
        }
        System.out.println("List Of Students:");
        for (int i = 0; i < 1; i++) {
            System.out.println(listStudent[i]);
        }
    }
}
