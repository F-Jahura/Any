package Task2;

import java.util.Scanner;

public class Work2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A:");
        int a = scanner.nextInt();
        System.out.println("Please enter B:");
        int b = scanner.nextInt();
        int m = a;
        while (m <= b){
            if (m % 5 == 0 && m % 10 != 0){
                System.out.println(m + "");
            } m++;
        }
    }
}
