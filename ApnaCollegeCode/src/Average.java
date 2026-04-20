// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
class Average{
    static double averageOfThree(int a, int b, int c){
        return (a+b+c)/2;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter value of c");
        int c=sc.nextInt();
        double ans = averageOfThree(a, b, c);
        System.out.println(ans);
    }
}