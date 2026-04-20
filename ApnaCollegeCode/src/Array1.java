// Array basic program 1

import java.util.*;
class Array1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //* First part
        // int[] arr = new int[4];
        // arr[0] = 20;
        // arr[1] = 30;
        // arr[2] = 40;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        //* Second part
        // for(int i=0; i<3; i++){
        // System.out.println(arr[i]);
        // }

        // *taking input size of array from user
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];

        // for  input of elements of array
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        // for output
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
        
    }
}
