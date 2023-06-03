package ItemManager.DTO;

/**
 *
 * @author Tin
 */
import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        this.height = 0;
        this.width = 0;
        this.isWatercolour = false;
        this.isFramed = false;
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        input();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a height: ");
        this.height = Integer.parseInt(scan.nextLine());
        System.out.print("Input a width: ");
        this.width = Integer.parseInt(scan.nextLine());
        System.out.print("Input is water colour: ");
        this.isWatercolour = scan.nextBoolean();
        System.out.print("Input is framed: ");
        this.isFramed = scan.nextBoolean();

    }

    public void outputPainting() {
        output();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Water Colour: " + this.isWatercolour);
        System.out.println("Framed: " + this.isFramed);
    }

}
