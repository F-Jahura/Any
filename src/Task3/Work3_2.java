package Task3;

import java.util.Scanner;

public class Work3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter A: ");
            double a = scanner.nextDouble();
            System.out.println("Please enter B: ");
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Program is over!");
                break;
            }
            double result = a / b;
            System.out.println("Result: " + result);
        }

    }
    }
