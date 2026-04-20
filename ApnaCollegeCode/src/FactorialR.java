import java.util.*;
class FactorialR {

    // least optimized - normal recursion
    static long factorial(long n){
        if(n < 0) 
        throw new IllegalArgumentException("For factorial you must not entered negative numbers"); 
        // "new" will create an object in memory, here it creates an exception object
        // "IllegalArgumentException" type of error and class name of the exception which means “You gave the method a wrong or invalid input.”  illegal - invalid, argument - the value you passed to a method, exception -error object
        // "throw" send the exception out and stop the function immediately

        if(n <= 1) return 1;  // in case user enters 0 then 0! = 1

        return n*factorial(n-1);
    }

    // tail recursion - optimized way
    static long factorial2(long n, long fact){
        if(n < 0) 
        throw new IllegalArgumentException("For factorial you must not entered negative numbers"); 

        if(n <= 1) return fact; //  i mistakenly return 1 forget that to get the answer i must return fact not 1

        return factorial2(n-1, fact * n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); 
        long n = sc.nextInt(); // using long instead of int for large outputs ( integer limit is ~2 billion)
        // System.out.println("Factorial of " +n+ " : " +factorial(n));
        
        long fact = 1;
        System.out.println("Factorial  : " +factorial2(n, fact));
    }
}