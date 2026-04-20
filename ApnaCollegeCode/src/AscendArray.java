// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;
class AscendArray{
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

        System.out.println("input numbers of array are : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        
        // checking is ascending or not
        for(int i=0; i<size; i++){
            if(arr[i] < arr[i+1]){
            System.out.println(" array is in ascending order");
            break;
            }   
            else{
            System.out.println("array isn't is ascending order");
            break;
            }
        }

    }
}
