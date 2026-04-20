// * 0-1 Triangle
import java.util.*;
class Pattern9{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        // outer loop
        for(int i=1; i<=r; i++){

            // inner loop, if sum of ith row and jth column is even print 1 else print 0
            for(int j=1; j<=i; j++){
                if((i+j)%2==0)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}