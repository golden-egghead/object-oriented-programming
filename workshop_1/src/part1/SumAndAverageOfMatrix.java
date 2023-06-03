package part1;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class SumAndAverageOfMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int column = 0;
        int row = 0;
        int sum = 0;
        double avr = 0;
        double numberOfElement = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = scan.nextInt();
        System.out.print("Enter number of columns: ");
        column = scan.nextInt();
        numberOfElement = row * column;
        int[][] ar = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("m[%d][%d]: ", (i + 1), (j + 1));
                ar[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%3d", ar[i][j]);
                sum += ar[i][j];
            }
            System.out.print("\n");
        }
        avr = (double)sum / numberOfElement;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avr);
    }

}
