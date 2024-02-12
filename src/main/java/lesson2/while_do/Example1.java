package lesson2.while_do;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int countPhoto = 0;
        Scanner scanner = new Scanner(System.in);
        while (countPhoto <= 100) {
            System.out.println("How many photo do you want to download?");
            int tempCount = scanner.nextInt();
            if ((countPhoto + tempCount) > 100) {
                System.out.println("The limit is reached");
            }
            countPhoto = countPhoto + tempCount;
            System.out.println("You can load" + (100 - countPhoto));
        }
        scanner.close();
    }
}