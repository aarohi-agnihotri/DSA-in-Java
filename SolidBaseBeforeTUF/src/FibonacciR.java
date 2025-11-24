import java.util.*;
class FibonacciR {
    
    // first way
    static void fibonacci(int a, int b, int n){
        if(n < 0) 
        return;
        System.out.print(b+ " ");
        fibonacci(b, a+b, n-1);
    }

    // second way
    static void fibonacci2(int a, int b, int n){
        if(n < 0) 
        return;
        
        int c = a+b;
        System.out.print(c+ " ");
        fibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); 
        int n = sc.nextInt(); 

        // System.out.print("Fibonacci  : 0 ");
        // fibonacci(0, 1, n-2); // n-2 because  0 and 1 already print first

        int a = 0, b = 1;
        System.out.print("Fibonacci  : 0 ");
        fibonacci(a, b, n-2); 
    }
}