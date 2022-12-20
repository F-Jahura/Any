package Task4;

import java.util.Arrays;
import java.util.Random;

public class Work4_3 {
    public static void main(String[] args) {
        int matrix[] [] = new int[12][8];
        Random random = new Random();

        for (int i =0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = random.nextInt(50);
                //System.out.print(matrix[i][j] + "  ");
            }
            //System.out.println();
        }


        int maxSum = 0;
        int maxIndex = 0;

        for (int i =0; i<matrix.length; i++){
            int sum = 0;
            for (int j = 0; j<matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
            System.out.println("Total sum of each ceil: " + sum);
            if (sum >= maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("Maximum number: " + maxSum);
        System.out.println("Index of maximum number: " + maxIndex);

    }
}
