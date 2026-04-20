// * Write a program to find if a number is a power of 2 or not.

// When a number is a power of 2, then it's binary form always looks like 1 (2^0), 10 (2), 100 (4), 1000 (8), 10000 (16), 100000 (32) and so on. The pattern is there is only '1' and rest all are zeros.

import java.util.*;
class BitPow2{
    static boolean usingLoop(int n){
        if(n <= 0) 
        return false;

        while(n%2 == 0){
            n /= 2;
        }
        return n == 1; // 1 == 1 returns true, otherwise return false
    }

    static boolean usingBit(int num){
        if(num <= 0) 
        return false;
        // int diff = num - 1;
        // int result = diff & num;
        // return result == 0;

        // minimal -
        return (num & (num - 1)) == 0;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        // using the loop method: keep dividing by 2, if u end at 1, it's a power of 2 - otherwise not
        // if(usingLoop(num))
        //     System.out.println(num +" is a power of 2");
        // else
        //     System.out.println(num +" is not a power of 2");

        // using bitwise AND operation: A number is a power of 2 if it has only 1 bit set in its binary form. subtracting 1 from such number flips all bits to the right of the set bit, making (n & (n-1)) equal to 0
        if(usingBit(num))
            System.out.println(num +" is a power of 2");
        else
            System.out.println(num +" is not a power of 2");
    }
}