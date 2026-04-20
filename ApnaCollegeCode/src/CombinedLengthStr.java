// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
class CombinedLengthStr{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array of strings: ");
        int size = sc.nextInt();
        sc.nextLine();

        String str[] = new String[size];
        int totLength = 0;

        System.out.println("Enter array of strings: ");
        for(int i=0; i<size; i++){
            str[i] =  sc.nextLine();
        }

        System.out.println("Array of strings are: ");
        for(int i=0; i<size; i++){
            System.out.println(str[i]);
        }
        
        for(int i=0; i<size; i++){
            totLength += str[i].length();
        }
        System.out.println("Cumulative length of all those strings are: " +totLength);
    }
}