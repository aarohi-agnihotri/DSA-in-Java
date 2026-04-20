// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int a=0;
        int b=1,c;
        System.out.print(a +"\t"+ b+ "\t");
        for(int i=1; i<=n; i++){
            c= a+b;
            System.out.print(c +"\t");
            a=b;
            b=c;
        }
    }
}