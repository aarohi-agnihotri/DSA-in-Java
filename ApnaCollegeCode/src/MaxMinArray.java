// Find the maximum & minimum number in an array of integers. 
// Integer.MIN_VALUE & Integer.MAX_VALUE in Java
// Integer.MAX_VALUE = It’s the largest value a Java int can hold. (2^31 - 1)
//  Integer.MIN_VALUE = It’s the smallest value a Java int can hold. (-2^31)

import java.util.*;
class MaxMinArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // *taking input from user
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        
        System.out.println("enter numbers");

        // for  input of elements of array
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("entered values in array form are ");

        // for output
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // for max and min value

        //* Reason for flipped initialization:
        //*  min starts very high → any array value will be smaller and replace it.
        //*  max starts very low → any array value will be larger and replace it.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            if( arr[i] < min)
            min =  arr[i];
            else
            max = arr[i];
        }
        System.out.println("maximum value  " + max);
        System.out.println("minimum value  " + min);
    }
}
