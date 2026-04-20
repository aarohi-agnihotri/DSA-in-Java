// * 
import java.util.*;
class Pattern14{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();

        // * For triangle
        // outer loop
        for(int i=1; i<=r; i++){

            // spaces inner loop 1
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // stars inner loop 2
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // * For inverted triangle
        for(int i=r; i>=1; i--){

            // spaces inner loop 1
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // stars inner loop 2
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
