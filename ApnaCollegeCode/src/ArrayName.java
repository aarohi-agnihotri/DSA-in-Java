// Take an array of names as input from the user and print them on the screen.

import java.util.*;
class ArrayName{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // *taking input from user
        System.out.println("enter size of an array");
        int size = sc.nextInt();
        String arr[]= new String[size];
        sc.nextLine();
        System.out.println("enter names");
        // for  input of elements of array
        for(int i=0; i<size; i++){
            arr[i]= sc.nextLine();
        }

        System.out.println("names are entered are: ");

        // for output
        for(int i=0; i<size; i++){
            System.out.print(arr[i]);
        }

    }
}
