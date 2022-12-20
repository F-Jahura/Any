package Task3;

import java.util.Scanner;

public class Work3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++){
            System.out.println("Please enter A: ");
            double a = scanner.nextDouble();
            System.out.println("Please enter B: ");
            double b = scanner.nextDouble();

            if (b == 0){
                System.out.println("Cannot be divided by zero");
                continue;
            }
            double result = a/b;
            System.out.println("Result: " + result);
        }
    }
}
