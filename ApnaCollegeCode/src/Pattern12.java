// * triangle pattern 
import java.util.*;
class Pattern12{
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
            for(int k=1; k<=2*i-1; k++){
                if(k%2==0)
                    System.out.print(" ");
                else{
                System.out.print(i);
               
                }
            }
            System.out.println();
        }
    }
}
