// *Selection sort - 
// dividing the array into 2 parts- the left is sorted part and the right is unsorted part
// for each positon 'i' from left to right :
// look through the entire unsorted part
// find the smallest element in that unsorted part
// then swap it with element at position i
// after each pass, the smallest remainaing element gets fixed at its correct position on the left.
//key idea: instead of bubbling, in inner loop u search for minimum in unsorted array and places the elements in increasing order.
// time complexity - O(n*n) because for every index i, j scans entire unsorted part.

import java.util.*;
class SelectionSort{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // *taking input from user
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];

        // for  input of elements of array
        System.out.println("enter elements of an array");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        

        System.out.println("array in ascending order are ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}