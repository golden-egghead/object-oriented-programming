package ItemManager.DTO;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        this.weight = 0;
        this.colour = null;
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    
    public void inputStatue() {
        input();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a weight: ");
        this.weight = Integer.parseInt(scan.nextLine());
        System.out.print("Input a colour: ");
        this.colour = scan.nextLine();
    }
    
    public void outputStatue() {
        output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
}
