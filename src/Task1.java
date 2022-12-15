public class Task1 {
    public static void main(String[] args) {
        int value = 0;
        System.out.println("While: ");
        while (value < 10){
            System.out.print("Java ");
            value++;
        }

        System.out.println();
        System.out.println("For: ");
        for (int i = 0; i < 10; i++){
            System.out.print("Java ");
        }

        System.out.println();
        System.out.println("For: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Java ");
        }

        System.out.println();
        int year = 1980;
        while (year <= 2020){
            System.out.println("Olympic " + year + " year");
            year += 4;
        }

        System.out.println();
        for (int i = 1980; i <= 2020; i+=4){
            System.out.println("Olympic " + i + " year");

        }

        System.out.println();
        int k = 5;
        int m=1;
        while (m <=9){
            System.out.println(m + " x " + k + " = "+ m*k);
            m++;
        }

        System.out.println();
        for (int i = 1; i<=9; i++){
            System.out.println(i + " x " + k + " = " + i*k);
        }
    }
}
