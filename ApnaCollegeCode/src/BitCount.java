// Write a program to count the number of 1’s and 0's in a binary representation of the number.

import java.util.*;
class BitCount{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number in binary form");
        String str = sc.next();
        int countOne = 0, countZero = 0;
        
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == '0')
            countZero++;
            else if(str.charAt(i) == '1')
            countOne++;
            else{
            System.out.println("invalid binary number");
            return;
            }
        }

        System.out.println("number of 1’s in a binary representation of the " + str + ": " +countOne);
        System.out.println("number of 0’s in a binary representation of the " + str + ": " +countZero);
    }
}
