import java.util.*;
class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = sc.nextInt();
        
        // * Prime checking with early exit and using n/2 or using square root of n
        // * using √n is because if a number has any factor , one of those factors will always less than or equal to √n
        if(n==3 || n==2){
            System.out.println( n+ " is a prime number ");
        }

            // for(int i=2; i <= n/2 ; i++){
            for(int i=2; i <= Math.sqrt(n) ; i++){
                if(n%i == 0){
                    System.out.println(n + " is not a prime number");
                    break;
                }
                else 
                System.out.println(n + " is a prime number");
            }
    }
}