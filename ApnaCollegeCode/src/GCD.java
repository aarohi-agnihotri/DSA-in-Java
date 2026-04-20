// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;
class GCD{
    static int GCDbyDivisor (int a, int b){
        //* divisor checking method
        int max = 1;  // GCD is always >= 1
        for(int i=2; i<= Math.min(a,b) ; i++){   // Math.min because no number greater than the smaller input can divide that smaller input
            if(a%i == 0 && b%i == 0){
                if(i > max)
                max=i;
            }
        }
        return max;
    }

    static int GCDbySubtraction (int a, int b){
        // * subtraction based euclidean method- keep subtracting the smaller one from larger one until both becomes equal, when both numbers are equal that's gcd
            while (a!=b){
                if(a >b)
                a = a-b;
        
                else
                b = b-a;

            }
           return a;
    }

    static int GCDbyModulus (int a, int b){
        // * euclidean method (modulus) - replacing the larger number with remainder when divided by smaller one, repeat until remainder = 0, last non zero remainder is GCD (in maths larger value matters but in code it doesn't matter)
        // a % b → remainder → replace a with b, b with remainder → repeat
        while(b != 0){
           int r =a % b;
           a = b;
           b = r;
            
        }
        return a;
    }

    static int GCDbyRecursion (int a, int b){
        // * recursion based
        // example - 18,12 then 12,6 then 6,0
        return b == 0 ? a : GCDbyRecursion(b, a%b );

    }

    static int GCDbyPrimeFactorisation (int a, int b){
        // * prime factorisation method
        int gcd = 1;
        for(int i=2; i<= Math.min(a,b) ; i++){ 
            if(a%i == 0 && b%i == 0)
                gcd *= i;
                a /= i;
                b /= i;
        }
        return gcd;
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();

        // int gcd = GCDbyDivisor(a, b);
        // int gcd = GCDbySubtractionCD(a, b);
        // int gcd = GCDbyModulus(a, b);
        int gcd = GCDbyRecursion(a, b);
        // int gcd = GCDbyPrimeFactorisation(a, b);
        System.out.println("Greatest common divisor is " + gcd);
    }
}