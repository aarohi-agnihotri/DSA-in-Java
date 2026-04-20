    // * rhombus
import java.util.*;
class Pattern11{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();

        // outer loop
        for(int i=1; i<=r; i++){

            // spaces inner loop 1
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // stars inner loop 2
            for(int k=1; k<=r; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
