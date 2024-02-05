package lesson2.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitWithForCycle {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        System.out.println(arrayInt.length);

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i]=(i+1)*10;
        }
        System.out.println(Arrays.toString(arrayInt));
        Random randomizer=new Random();
        int randomInt=randomizer.nextInt(-50,51);
        System.out.println(randomInt);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
    }
}
