// take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
class ArraySearch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // *taking input from user
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];

        // for  input of elements of array
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter value of x");
        int x=sc.nextInt();

        // for output
        for(int i=0; i<size; i++){
            if(arr[i] == x)
            System.out.println("x found at index "+ i);
        }

        // if u define array like below, and want to know the length of array thn we use ->
        int[] arr2 = {2,3,4,5};
        System.out.println("size of arr2 is "+ arr2.length);
        
    }
}
