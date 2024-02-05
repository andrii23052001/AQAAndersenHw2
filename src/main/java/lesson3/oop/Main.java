package lesson3.oop;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of Recipe with the constructor
        Recipe saltedWater = new Recipe("Water with salt", 10, new String[]{"Salt", "Water"});




        // Displaying information
        System.out.println("==============================");
        saltedWater.getInfo();

        // Creating a reference to the existing instance (not a new instance)
        Recipe saltedWater2 = saltedWater;

        // Modifying the price through saltedWater2
        saltedWater2.price = 12;

        // Displaying information for saltedWater
        System.out.println("==============================");
        saltedWater.getInfo();

        // Displaying information for saltedWater2
        System.out.println("==============================");
        saltedWater2.getInfo();
    }
}