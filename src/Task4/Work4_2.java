package Task4;

import java.util.Arrays;
import java.util.Random;

public class Work4_2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxNumber = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        System.out.println("Maximum number in array: " + maxNumber);

        int minNumber = 10000;
        for (int i = 0; i< array.length; i++){
            if (array[i] < minNumber){
                minNumber = array[i];
            }
        }
        System.out.println("Minimum number in array: " + minNumber);

        int numberWithZero = 0;
        int sum =0;
        for (int i = 0; i< array.length; i++){
            if (array[i] % 10 == 0){
                numberWithZero++;
                sum = sum + array[i];
            }
        }
        System.out.println("Number with zero in array: " + numberWithZero);
        System.out.println("Total sum with zero: " + sum);
    }
}
