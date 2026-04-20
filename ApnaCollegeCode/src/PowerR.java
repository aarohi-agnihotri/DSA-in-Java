// Print x^n (with stack height = n)
import java.util.*;
class PowerR {

    // time complexity : n
    static int calcPower(int x, int n, int ans){
        if(x == 0) return 0;
        if(n == 1) return ans*x;
        return calcPower(x, n-1, ans*x);
    }

    // time complexity : log₂(n) => O(log n),  below is iteration fast power method / binary exponentiation method
    static double calcPowerOp(double x, long n){
        if(x == 0.0) return 0.0;
        if(n == 0 || x == 1.0) return 1.0;
        if(n == 1) return x;
        double ans = 1;
        long m = n; 
        if(m < 0) n = -n; // previously i wrote n = n*(-1)

        // here i remove n=n-1 for odd condition because n/2 already gives the floor division and reducing the n too
        while(n > 0){
            if(n % 2 == 1) ans *= x;
            x *= x;
            n = n/2;
            }

        return m < 0 ? 1/ans : ans;
    }

    // time complexity : O(log n), binary exponentiation using recursive method
    static double calcPowerR(double x, long n){
        if(x == 0.0) return 0.0;
        if(n == 0 || x == 1.0) return 1.0;
        if(n == 1) return x;

        // double ans = 1;
        // long m = n; 
        // if(m < 0) return 1/calcPowerR(x, -n);

        // if(n % 2 == 1) return  calcPowerR(double x*ans, long n)
        // else calcPowerR(double x, long n-1, double ans*x)
        // if(m < 0) ans = 1.0/ans;
        // return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a base"); 
        // int x = sc.nextInt(); 
        
        // System.out.println("Enter an exponent"); 
        // int n = sc.nextInt();
        // System.out.println(calcPower(x, n, 1)); 
        
        System.out.println("Enter a base"); 
        double x = sc.nextDouble(); 
        
        System.out.println("Enter an exponent"); 
        long n = sc.nextLong(); 

        // System.out.println(calcPowerOp(x, n)); 
        System.out.println(calcPowerR(x, n)); 
        
    }
}