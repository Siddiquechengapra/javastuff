import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = inp.nextInt();
        System.out.println(isarm(n));

    }
    static boolean isarm(int n){
int temp = n;
int sum=0;
        while(n>0){
            int remainder = n %10;
            sum +=remainder*remainder*remainder;
            n=n/10;
        }
        return (sum==temp);
    }
}
