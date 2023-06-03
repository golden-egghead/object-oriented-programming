package workshop3;

public class Tester {

    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", 200, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("State of obj1: ");
        obj1.createSound();
        System.out.println("State of obj2: ");
        obj2.createSound();
        
        System.out.println("Set price = 3000 of obj 1");
        obj1.setPrice(3000);
        System.out.println("Get price of obj 1: " + obj1.getPrice());
    }
}
