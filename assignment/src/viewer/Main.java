package viewer;

/**
 *
 * @author Tin
 */

import controller.CompanyManagement;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        try {
                String choice;
            do {
                CompanyManagement listReq = new CompanyManagement("src/input/ListOfEmployees.txt", "src/input/PLInfo.txt");

                System.out.print("___________________________MENU___________________________\n"
                        + "1. Read all Employees and print to screen\n"
                        + "2. Show staff proficient in a Programming Language\n"
                        + "3. Show Tester has a height salary\n"
                        + "4. Show Employee’s higest salary\n"
                        + "5. Show Leader of the Team has most Employees\n"
                        + "6. Sort Employees as descending salary\n"
                        + "7. Write file\n"
                        + "8. Exit\n"
                        + "Your options from 1 - 8: ");
                Scanner scan = new Scanner(System.in);
                choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        listReq.printEmpList();
                        break;
                    case "2":
                        System.out.print("Input the Programming Language: ");
                        listReq.toPrint(listReq.getDeveloperByProgrammingLanguages(scan.nextLine()));
                        break;
                    case "3":
                        System.out.print("Input salary: ");
                        listReq.toPrint(listReq.getTestersHaveSalaryGreaterThan(Double.parseDouble(scan.nextLine())));
                        break;
                    case "4":
                        System.out.println(listReq.getEmployeeWithHigestSalary());
                        break;
                    case "5":
                        System.out.println(listReq.getLeaderWithMostEmployees());
                        break;
                    case "6":
                        listReq.toPrint(listReq.sorted());
                        break;
                    case "7":
                        listReq.writeFile("src/output/Req2.txt", listReq.getDeveloperByProgrammingLanguages("C++"));
                        listReq.writeFile("src/output/Req3.txt", listReq.getEmployeeWithHigestSalary());
                        break;
                    default:
                        scan.close();
                        System.out.println("Good Bye!");
                        break;

                }

            } while (choice.compareTo("1") >= 0 && choice.compareTo("7") <= 0);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound);
        } catch (IOException IOE) {
            System.out.println(IOE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
