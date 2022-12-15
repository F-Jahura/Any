package Task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Work4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array number: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array length: " + array.length);

        int counter8 =0;

        for (int i = 0; i< array.length; i++){
            if (array[i] > 8){
                counter8++;
            }
        }
        System.out.println("Number in array more than 8: " + counter8);

        int counter1 =0;

        for (int i = 0; i< array.length; i++){
            if (array[i] == 1){
                counter1++;
            }
        }
        System.out.println("Number 1 in array: " + counter1);

        int counterEven =0;

        for (int i = 0; i< array.length; i++){
            if (array[i] % 2 == 0){
                counterEven++;
            }
        }
        System.out.println("Even number in array: " + counterEven);

        int counterOdd =0;

        for (int i = 0; i< array.length; i++){
            if (array[i] % 2 != 0){
                counterOdd++;
            }
        }
        System.out.println("Odd number in array: " + counterOdd);

        int sum =0;

        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Total amount of array: " + sum);



    }
}
