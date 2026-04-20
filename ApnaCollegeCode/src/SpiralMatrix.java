// Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]
// 1. We will need 4 variables:
// a. row_start - initialized with 0.
// b. row_end - initialized with n-1.
// c. column_start - initialized with 0.
// d. column_end - initialized with m-1.

// 2. First of all, we will traverse in the row row_start from column_start to column_end and we will increase the row_start with 1 as we have traversed the starting row.
// 3. Then we will traverse in the column column_end from row_start to row_end and decrease the column_end by 1.
// 4. Then we will traverse in the row row_end from column_end to column_start and decrease the row_end by 1.
// 5. Then we will traverse in the column column_start from row_end to row_start and increase the column_start by 1.
// 6. We will do the above steps from 2 to 5 until row_start <= row_end -and column_start <= column_end.

import java.util.*;
class SpiralMatrix{
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

        // spiral of matrix
        System.out.println("Spiral of matrix :");

        int rs = 0; // row start
        int cs = 0; // column start
        int re = r-1;  // row end, row - 1 because indexing start from 0
        int ce = c-1; // column end

        while(rs<=re && cs<=ce){

            // 1
            for( c=cs;  c<=ce; c++){
                System.out.print(arr[rs][c] +"\t");
            }
            rs++;

            //2
            for( r=rs; r<=re; r++){
                System.out.print(arr[r][ce] +"\t");
            }
            ce--;

            //3
            if(rs <= re){
                for( c=ce; c>=cs; c--){
                    System.out.print(arr[re][c] +"\t");
                }
                re--;
            }

            //4
            if(cs <= ce){
                for( r=re; r>=rs; r--){
                    System.out.print(arr[r][cs] +"\t");
                }
                cs++;
            }
        }
    }
        
}


