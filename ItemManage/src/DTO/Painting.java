package DTO;

/**
 *
 * @author tin
 */
import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
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

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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

    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWaterColour);
        System.out.println("Is Framed: " + isFramed);
    }

    public void inputPainting() {
        input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a height: ");
        this.height = scan.nextInt();
        System.out.println("Input a width: ");
        this.width = scan.nextInt();
        System.out.println("Input is watercolour: ");
        this.isWaterColour = scan.nextBoolean();
        System.out.println("Input is framed: ");
        this.isFramed = scan.nextBoolean();
    }

}
