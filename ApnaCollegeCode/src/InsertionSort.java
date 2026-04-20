// *Insertion sort - 
// Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards. Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
// dividing the array into 2 parts – left is sorted, right is unsorted
// start from index 1, because element at index 0 is already “sorted”
// pick the current element (key) from the unsorted part
// move left and shift all elements that are bigger than the key
// keep shifting until you find the correct position for the key and stop if not find -
// then insert the key into that position
// after each pass, the sorted part on the left grows by one element
// It performs very well on small or nearly-sorted data.
// It is stable and in-place (no extra memory).
// key idea: instead of searching for minimum like selection sort,
//           we insert each element into its correct position by shifting
// time complexity - O(n*n) because for every index i, j scans entire unsorted part.

import java.util.*;
class InsertionSort{
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
        // mostly used way- using while loop
        // This is the cleanest and most commonly used form. No wasted checks, no clutter. Good choice if you care about readability.
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while((j>=0) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        // another way: here I used for loop , Also solid and Compact
        // for(int i=1; i<n; i++){
        //     int key = arr[i], j;
        //     for( j= i-1; (j>=0) && (arr[j] > key); j--){
        //             arr[j+1] = arr[j];
        //     }
        //     arr[j+1] = key;
        // }  

        //another way: here I used break and for loop => Works, but it’s the least elegant because the break adds noise.

        // for(int i=1; i<n; i++){
        //     int key = arr[i], j;
        //     for( j= i-1; j>=0; j--){
        //         if(arr[j] > key){
        //             arr[j+1] = arr[j];
        //         } else break;
        //     }
        //     arr[j+1] = key;
        // }   
            
        System.out.println("array in ascending order are ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

// why i = 1;
// Insertion sort always starts sorting from the second element, comparing it to the left side.
// If you start from i = 0, the inner loop becomes pointless because there is nothing on the left to compare or shift.
// So the first meaningful insertion happens at index 1.

// Why j + 1 when placing the key?
// because j always ends one step before the correct place for key.