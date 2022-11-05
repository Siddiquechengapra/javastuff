import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the number");
            int count = 0;
            int n = inp.nextInt();
            System.out.println("Enter the number to select");
            int m = inp.nextInt();


            while (n != 0) {
                if (n % 10 == m) {
                    count++;
                }
                n = n / 10;
            }
            System.out.println("count " + count);
        }


    }
}
