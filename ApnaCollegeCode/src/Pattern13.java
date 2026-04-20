// * palindromic triangle pattern 
import java.util.*;
class Pattern13{
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
            // numbers inner loop 2
            for(int k=i; k>=1; k--){
                System.out.print(k);
            }
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
            }
        }
    }

