// *Bubble sort - (ascending)
// repeatedly scan th element from left to right
// each time, u compare two adjancent elements
// if left one is biggger than the right one, then we swap
// After one full pass, the largest element settles at the end 
// repeating passes again and again, but each time we can ignore the sorted ones
// then stop when pass happens with no swaps, means the list is sorted

// Idea: if arr[i] > arr[i+1] swap them. To place the element in their respective position, we have to do the following operation N-1 times. 
// Time complexity is - O(n^2) because we run the outer loop n times. For each pass, inner loop run n times, so n* n times loop runs

// 2 improvements i made: using a separate variable for bubble-sort passes, so no need to touch the real size and 2nd is using break to stop early if no swap happens in a pass
import java.util.*;
class BubbleSort{
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
        while(n != 0){
            boolean isSwap = false;

            for(int i=0; i< n-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp= arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSwap = true;
                }
            }

            if(!isSwap) break;  // array already sorted
            n--;
        }

        System.out.println("array in ascending order are ");

        // below, i accidently used size instead of length method and wonder why my sorted array doesn't print because after sorting size becomes zero, so below condition failed 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}