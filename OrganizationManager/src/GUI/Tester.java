package GUI;

/**
 *
 * @author Tin
 */
import DTO.*;

public class Tester {

    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        IRole df = new BeeColony(3000, "wasp", "land");
        System.out.println(df);
        df.createWorker();
        df = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(df);
        df.createWorker();
    }
}
