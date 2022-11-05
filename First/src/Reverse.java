import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

            System.out.println("Enter the number");
            int n= inp.nextInt();
            int reverse = 0;
        while (n != 0) {
            reverse= reverse * 10 + (n % 10);
            n /= 10;
        }
            System.out.println("reverse " + reverse);



    }
}
