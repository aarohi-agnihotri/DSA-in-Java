// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
class Count{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int countPos=0, countZero=0, countNeg=0, n;
        char ch;
        do{
            System.out.println("enter y to continue, n to stop");
            ch = sc.next().charAt(0);
            if(ch == 'n')
            break;
            System.out.println("Enter a number");
            n= sc.nextInt();
            if(n>0)
            countPos++;
            else if(n==0)
            countZero++;
            if(n<0)
            countNeg++;
            }while(ch != 'n');

        System.out.println("Total number of zeroes " + countZero);
        System.out.println("Total number of positive numbers " + countPos);
        System.out.println("Total number of negative numbers " + countNeg);
        
        
    }
}
