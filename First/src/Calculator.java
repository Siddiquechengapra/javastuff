import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ans= 0;
        boolean run =true;

        while(run){
            System.out.println("Enter the numbers");
            int num1=inp.nextInt();
            int num2=inp.nextInt();
            System.out.println("Enter the operation");
            int op=inp.next().trim().charAt(0);

            switch (op){
                case '+':
                    ans = num1 +num2;
           System.out.println("plus"+ans);
                    break;
                case '-':
                    ans = num1 - num2;

                    System.out.println("minus"+ans);
                    break;
                case '/':
                    ans = num1 / num2;

                    System.out.println("divide"+ans);
                    break;
                case '%':
                    ans = num1  %num2;

                    System.out.println("mode"+ans);
                    break;
                case 'x':
                    run =false;

                    System.out.println("switching off");
                    break;
               default:
                   System.out.println("invalid op");

                   break;            }


        }

    }
}
