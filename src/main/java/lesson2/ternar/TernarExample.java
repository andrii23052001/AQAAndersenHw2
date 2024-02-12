package lesson2.ternar;

import java.util.Scanner;

public class TernarExample {
    // условие ? выражение1 : выражение2
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        String massage = age<18? "You are not adult": age>30?"You are older then 30":"You are between 18 and 30";
        System.out.println(massage);
        scanner.close();
    }
}
