package Task2;

import java.util.Scanner;

public class Work2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A: ");
        int a = scanner.nextInt();
        System.out.println("Please enter B: ");
        int b = scanner.nextInt();
        for (int i = a+1; i < b; i++){
            if (i%5 == 0 && i%10 != 0){
                System.out.println(i + "");
            }
        }
        if( a >= b){
            System.out.println("The number is not correct");
        }
    }
}
