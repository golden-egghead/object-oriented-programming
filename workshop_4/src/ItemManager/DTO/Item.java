package ItemManager.DTO;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class Item {

    private int value;
    private String creator;

    public Item() {
        this.value = 0;
        this.creator = null;
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Input value: ");
            this.value = Integer.parseInt(scan.nextLine());
            System.out.print("Input creator: ");
            this.creator = scan.nextLine();
        } while (this.value <= 0 && this.creator != null);

    }

    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

}
