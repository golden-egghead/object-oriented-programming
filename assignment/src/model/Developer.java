package model;

/**
 *
 * @author Tin
 */
import java.util.ArrayList;

public class Developer extends Employee {

    protected String teamName;
    protected ArrayList<String> programmingLanguages;
    protected int expYear;

    public Developer(String empID, String empName, int baseSal, String teamName,
            ArrayList<String> programmingLanguages, int expYear) {
        super(empID, empName, baseSal);
        this.teamName = teamName;
        this.programmingLanguages = programmingLanguages;
        this.expYear = expYear;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public int getExpYear() {
        return expYear;
    }

    @Override
    public double getSalary() {
        if (this.expYear >= 5) {
            return this.baseSal + this.expYear * 2000000;
        } else if (this.expYear >= 3 && this.expYear < 5) {
            return this.baseSal + this.expYear * 1000000;
        } else {
            return this.baseSal;
        }
    }

    @Override
    public String toString() {
        return this.empID + "_" + this.empName + "_" + this.baseSal + "_"
                + this.teamName + "_" + this.programmingLanguages.toString() + "_"
                + this.expYear;
    }
}
