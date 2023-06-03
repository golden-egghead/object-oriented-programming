package controller;

/**
 *
 * @author Tin
 */
//import model.*;
import model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class CompanyManagement<E> {

    private ArrayList<Employee> empList;

    public CompanyManagement(String path, String path1) throws Exception {
        empList = getEmployeeFromFile(path, path1);
    }

    public final ArrayList<Employee> getEmployeeFromFile(String path, String path1) throws Exception {
        ArrayList<Employee> result = null;
        HashMap pLInfo = new HashMap();
        try {
            String thisLine;
            BufferedReader myInput;
            File f = new File(path1);
            String fullPath = f.getAbsolutePath();
            FileInputStream file = new FileInputStream(fullPath);
            myInput = new BufferedReader(new InputStreamReader(file));

            while ((thisLine = myInput.readLine()) != null) {
                if (!thisLine.isEmpty()) {
                    String[] split = thisLine.split(",");
                    ArrayList<String> programmingLanguages = new ArrayList<>();
                    for (int i = 1; i < split.length; i++) {
                        programmingLanguages.add(split[i]);
                    }
                    pLInfo.put(split[0], programmingLanguages);
                }
            }
            myInput.close();

            f = new File(path);
            fullPath = f.getAbsolutePath();
            file = new FileInputStream(fullPath);
            myInput = new BufferedReader(new InputStreamReader(file));
            Employee emp;

            while ((thisLine = myInput.readLine()) != null) {
                if (!thisLine.isEmpty()) {
                    String[] split = thisLine.split(",");
                    if (result == null) {
                        result = new ArrayList<>();
                    }
                    if (split[1].charAt(0) == 'T') {
                        emp = new Tester(split[1], split[2], Integer.parseInt(split[5]),
                                Double.parseDouble(split[3]), split[4]);
                        result.add(emp);
                    } else if (split[5].equals("L")) {
                        emp = new TeamLeader(split[1], split[2], Integer.parseInt(split[7]),
                                split[3], (ArrayList<String>) pLInfo.get(split[1]),
                                Integer.parseInt(split[4]), Double.parseDouble(split[6]));
                        result.add(emp);
                    } else {
                        emp = new Developer(split[1], split[2], Integer.parseInt(split[5]),
                                split[3], (ArrayList<String>) pLInfo.get(split[1]), Integer.parseInt(split[4]));
                        result.add(emp);
                    }
                    empList = result;
                }

            }
            myInput.close();
        } finally {
            empList = result;
        }
        return empList;
    }

    public ArrayList<Developer> getDeveloperByProgrammingLanguages(String pL) {
        if (empList == null) {
            empList = new ArrayList<>();
        }

        ArrayList<Developer> listProgrammerProcientInputLanguage = null;

        for (Employee emp : empList) {
            if (emp instanceof Developer) {
                for (String pLODev : ((Developer) emp).getProgrammingLanguages()) {
                    if (listProgrammerProcientInputLanguage == null) {
                        listProgrammerProcientInputLanguage = new ArrayList<>();
                    }
                    if ((pLODev).equals(pL)) {
                        listProgrammerProcientInputLanguage.add((Developer) emp);
                    }
                }
            }
        }
        return listProgrammerProcientInputLanguage;
    }

    public ArrayList<Tester> getTestersHaveSalaryGreaterThan(double value) {
        if (empList == null) {
            empList = new ArrayList<>();
        }

        if (value < 0) {
            return null;
        }

        ArrayList<Tester> listTesterHaveSalaryGreaterThan = null;

        for (Employee emp : empList) {
            if (emp instanceof Tester) {
                if (emp.getSalary() > value) {
                    if (listTesterHaveSalaryGreaterThan == null) {
                        listTesterHaveSalaryGreaterThan = new ArrayList<>();
                    }
                    listTesterHaveSalaryGreaterThan.add((Tester) emp);
                }
            }
        }
        return listTesterHaveSalaryGreaterThan;
    }

    public Employee getEmployeeWithHigestSalary() {
        if (empList == null) {
            return null;
        }
        Employee e = null;

        for (Employee emp : empList) {
            if (e == null) {
                e = emp;
            }
            if (e.getSalary() <= emp.getSalary()) {
                e = emp;
            }
        }
        for (int i = empList.size() - 1; i >= 0; i--) {
            if (empList.get(i).getSalary() == e.getSalary()) {
                e = empList.get(i);
                break;
            }
        }
        return e;
    }

    public TeamLeader getLeaderWithMostEmployees() {
        if (empList == null) {
            return null;
        }

        TeamLeader bestLeader = null;
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof TeamLeader) {
                if (bestLeader == null) {
                    bestLeader = (TeamLeader) emp;
                    for (Employee empCount : empList) {
                        if (empCount instanceof Developer) {
                            if (((Developer) emp).getTeamName().equals(bestLeader.getTeamName())) {
                                count++;
                            }
                        }
                    }
                }
                int countToCompare = 0;
                if (((Developer) emp).getTeamName().compareTo(bestLeader.getTeamName()) != 0) {
                    for (Employee moreCount : empList) {
                        if (moreCount instanceof Developer) {
                            if (((Developer) moreCount).getTeamName().equals(((Developer) emp).getTeamName())) {
                                countToCompare++;
                            }
                        }
                    }
                }
                if (countToCompare > count) {
                    bestLeader = (TeamLeader) emp;
                    count = countToCompare;
                } else if (countToCompare == count) {
                    if (((TeamLeader) emp).getExpYear() > bestLeader.getExpYear()) {
                        bestLeader = (TeamLeader) emp;
                    }
                }

            }
        }

        return bestLeader;
    }

    public ArrayList<Employee> sorted() {
        if (empList == null) {
            return null;
        }

        ArrayList<Employee> sortByBaseSalaryList = (ArrayList<Employee>) empList.clone();

        Collections.sort(sortByBaseSalaryList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() == o2.getSalary()) {
                    int lastIndexOfFirstEmp = o1.getEmpName().lastIndexOf(" ");
                    int lastIndexOfSecondEmp = o2.getEmpName().lastIndexOf(" ");
                    return o1.getEmpName().charAt(lastIndexOfFirstEmp) - o2.getEmpName().charAt(lastIndexOfSecondEmp);
                } else {
                    return (int) (o2.getSalary() - o1.getSalary());
                }
            }
        });

        return sortByBaseSalaryList;
    }

    public void printEmpList() {
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    public boolean writeFile(String path, ArrayList<Employee> list) throws IOException {
        try {
            BufferedWriter bufferOut = new BufferedWriter(new FileWriter(path));

            for (Employee temp : list) {
                bufferOut.write(temp.toString());
//                bufferOut.write(temp.getEmpID() + "_"
//                        + temp.getEmpName() + "_" + temp.getBaseSal() + "_"
//                        + ((Developer) temp).getTeamName() + "_" + ((Developer) temp).getProgrammingLanguages()
//                        + "_" + ((Developer) temp).getExpYear());

                bufferOut.write("\r\n");
            }

            bufferOut.close();
            System.out.println("Writed staff proficient in a Programming Language to file");

        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean writeFile(String path, Employee temp) throws IOException {
        try {
            BufferedWriter bufferOut = new BufferedWriter(new FileWriter(path));
            bufferOut.write(temp.toString());
//            bufferOut.write(temp.getEmpID() + "_"
//                    + temp.getEmpName() + "_" + temp.getBaseSal() + "_"
//                    + ((Developer) temp).getTeamName() + "_" + ((Developer) temp).getProgrammingLanguages()
//                    + "_" + ((Developer) temp).getExpYear());
            bufferOut.close();
            System.out.println("Writed Employee’s higest salary to file");
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
//    public boolean writeFile(String path, E list) {
//        try {
//            BufferedWriter bufferOut = new BufferedWriter(new FileWriter(path));
//            bufferOut.write(list.toString());
//            bufferOut.write("\r\n");
//
//            bufferOut.close();
//
//        } catch (IOException e) {
//            System.out.println(e);
//            return false;
//        }
//        return true;
//    }
//
//    public boolean writeFile(String path, ArrayList<E> list) {
//        try {
//            BufferedWriter bufferOut = new BufferedWriter(new FileWriter(path));
//            for (E obj : list) {
//                bufferOut.write(obj.toString());
//                bufferOut.write("\r\n");
//            }
//            bufferOut.close();
//
//        } catch (IOException e) {
//            System.out.println(e);
//            return false;
//        }
//        return true;
//    }

    public void toPrint(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
