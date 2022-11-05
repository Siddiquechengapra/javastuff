import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = inp.nextInt();
        int prev = 0;
        int current =1;


        for (int i = 1; i < n ; i++) {
            int temp = prev + current;
            prev = current;
            current=temp;
        }
        System.out.println("currnt "+current + " " + prev);
    }
}