// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
class SumOfOdd{
    static int Odd (int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0)
            sum = sum +i;
        }
           return sum;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int sum = Odd(n);
        System.out.println(sum);
    }
}