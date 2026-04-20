// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
class GreaterOf2{
    static int Greater (int a, int b){
        if(a>b)
        return a;
        else
        return b;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of a");
        int b=sc.nextInt();
        int greater = Greater(a,b);
        System.out.println(greater);
    }
}