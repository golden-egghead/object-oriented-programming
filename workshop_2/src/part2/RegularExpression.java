package part2;

/**
 *
 * @author Tin
 */

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                String s = "";
                String pattern = "^[S]{1}[E]{1}[0-9]{3}$";
                Scanner scan = new Scanner(System.in);
                System.out.print("Input the string: ");
                s = scan.nextLine();
                if(!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("the string is " + s);
                cont = true;
                
            } catch(Exception e) {
                System.out.println("the string is invalid");
                cont = false;
            }
        } while(!cont);
    }
}
