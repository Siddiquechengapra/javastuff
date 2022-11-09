public class Prime {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(isPrime(i)==true){
                System.out.println(i);

            }
        }
    }
    static boolean isPrime(int n){
        int count =0;

        if(n==2){
            return true ;
        }
        else if(n%2==0){
            return false;
        }
        else{
            for(int i=3;i<(int)Math.sqrt(n);i+=2){
                if(n%i==0){
                    count ++;
                }
            }
           if(count != 0){
               return false;
           }
           else{
               return true;
           }
        }
    }
}
