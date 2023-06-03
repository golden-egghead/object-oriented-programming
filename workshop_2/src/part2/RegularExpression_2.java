package part2;

/**
 *
 * @author Tin
 */

import java.util.Scanner;

public class RegularExpression_2 {
    public String inputString() throws Exception {
        String s = "";
        String pattern = "^[S]{1}[E]{1}[0-9]{3}$";
        System.out.println("Input the string:");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        if(!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }
    
    public static void main(String[] args) {
        boolean cont = false;
        RegularExpression_2 obj = new RegularExpression_2();
        do {
            try {
                String s = obj.inputString();
                System.out.println("the string is " + s);
                cont = false;
                
            } catch(Exception e) {
                System.out.println("the string invalid");
                cont = true;
            }
        } while(cont);
    }
}
