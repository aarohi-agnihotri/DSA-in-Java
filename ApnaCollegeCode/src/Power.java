//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x to the power of n.

import java.util.*;
class Power{
    static double getPower(int x, int n){
        return Math.pow(x,n);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of x");
        int x=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        double ans = getPower(x, n);
        System.out.println("x to the power of n is " + ans);
    }
}