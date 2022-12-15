package Task3;

import java.util.Scanner;

public class Work3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter city: ");

        while (true){
            String city = scanner.nextLine();
            if (city.equals("stop")){
                System.out.println("Program is over!");
                break;
            }
            switch (city){
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("It is in Russia");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("It is in Italy");
                    break;
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("It is in England");
                    break;
                case "Berlin":
                case "Koln":
                case "Munchen":
                    System.out.println("It is in Germany");
                    break;

                default:
                    System.out.println("It is not identifiedf");
            }

        }

    }
}