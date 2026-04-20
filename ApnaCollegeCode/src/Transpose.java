// For a given matrix of N x M, print its transpose.
// Rows become columns
// Columns become rows

import java.util.*;
class Transpose{
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

        // transpose of matrix
        System.out.println("Transpose of matrix :");

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[j][i] +"\t");
                }
                System.out.println();
            }
                
        }
        
    }


