package Task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Work4_4 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i =0; i<array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int sumMax = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length-2; i++){
            int sum = 0;
            for (int j = i; j < i+3;  j++){
                sum = sum + array[j];
            }
            if (sum > sumMax){
                sumMax = sum;
                maxIndex = i;
            }
        }
        System.out.println("Maximum sum of next three numbers: " + sumMax);
        System.out.println("Index of maximum number: " + maxIndex);


    }
}
