package part2;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class CalculateBaseOnInputOperator {

    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0;
        double result = 0;
        String operator = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        firstNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Input the number 2: ");
        secondNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Input the operator: ");
        operator = scan.nextLine();
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber + secondNumber;
                break;
            case "*":
                result = firstNumber + secondNumber;
                break;
            case "/":
                result = (double)firstNumber / (double)secondNumber;
                break;
            default:
                break;
        }

        System.out.printf("The result of %d %s %d = %f\n", firstNumber, operator, secondNumber, result);
    }
}
