package ItemManager.DTO;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        this.height = 0;
        this.material = null;
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        input();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a height: ");
        this.height = Integer.parseInt(scan.nextLine());
        System.out.print("Input a material: ");
        this.material = scan.nextLine();
    }

    public void outputVase() {
        output();
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }

}
