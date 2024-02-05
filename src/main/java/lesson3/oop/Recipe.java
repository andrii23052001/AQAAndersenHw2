package lesson3.oop;

import java.util.Arrays;

public class Recipe {
    public String title;
    public int price;
    public boolean isVegan;
    public double timeToCook;

    public String [] listOfIngredients;

    public Recipe(String title, int price, String[] listOfIngredients) {
     this.title = title;
     this.price = price;
     this.listOfIngredients = listOfIngredients;
    }

    public  Recipe(String title,int price,boolean isVegan,String[]listOfIngredients){
        this(title,price,listOfIngredients);
        this.isVegan=isVegan;
        this.timeToCook=0.3;
    }

    public void getInfo(){
        System.out.println("Title of dish is "+title);
        System.out.println("Price "+price);
        System.out.println("List of Ingredients " + Arrays.toString(listOfIngredients));
    }
}
