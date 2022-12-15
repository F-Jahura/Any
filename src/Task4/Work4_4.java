package Task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Work4_4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i =0; i<array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxElement = 0;
        int sumMax = 0;
        int maxIndex = 0;

        for (int i =0; i<array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
                sumMax = maxElement + array[i + 1] + array[i + 2];
            }
        }
        //System.out.println("Maximum number: " + maxElement);
        System.out.println("Total summ of three elements: " + sumMax);
        System.out.println("Index of maximum number: " + maxIndex);



    }
}
