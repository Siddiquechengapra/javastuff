import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter 2 numbers!");

        int n1= inp.nextInt();
        int n2= inp.nextInt();
        int res = n1 + n2;

        System.out.println("sum!"+res);
    }
}