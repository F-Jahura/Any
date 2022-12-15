package Task2;

import java.util.Scanner;

public class Work2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the floor number: ");
        int floors = scanner.nextInt();
        if (floors >=1 && floors <=4){
            System.out.println("It is Low-Storey House");
        } else if (floors >=5 && floors <=8){
            System.out.println("It is Midium-Storey House");

        } else if (floors >= 9) {
            System.out.println("It is High-Storey House");
        } else
            System.out.println("It is wrong number");
    }
}
