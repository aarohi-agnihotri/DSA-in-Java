// * inverted half pyramid , rotated by 180 degree
import java.util.*;
class Pattern5{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();

        // outer loop
        for(int i=1; i<=r; i++){

            // inner loop -> spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // inner loop -> stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}