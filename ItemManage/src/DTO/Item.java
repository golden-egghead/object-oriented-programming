package DTO;

/**
 *
 * @author nguyen tin
 */
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

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

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    
    public void output() {
        System.out.println(value);
        System.out.println(creator);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a value: ");
        value = Integer.parseInt(scan.nextLine());
        System.out.println("Input a creator: ");
        creator = scan.nextLine();
    }
}
