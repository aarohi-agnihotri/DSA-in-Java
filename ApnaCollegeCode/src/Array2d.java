// taking input of size and numbers of 2d array and printing them
// Searching for an element x in a matrix.

import java.util.*;
class Array2d{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // taking input size of rows and columns
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();


        // defining 2d array
        int[][] arr = new int[r][c];

        // taking input of 2d array
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // printing them
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] +"\t");
            }
                System.out.println();
        }

        // searching for an element in x
        System.out.println("Enter value of x :");
        int x = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(x == arr[i][j]){
                    System.out.println("x is found at index " +i+ " "+j);
                    break;
                }
            }
                
        }
        
    }
}
