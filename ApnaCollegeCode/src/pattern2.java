// * hollow rectangle
import java.util.*;
class Pattern2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c=sc.nextInt();
        // int r=4, c=5;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){

              if(i>1 && i<r && j>1 && j<c)
                System.out.print(" ");
               else
                System.out.print("*");

            //    if(i==1 || j==1 || i==r || j==c)
            //     System.out.print("*");
            //    else
            //     System.out.print(" ");
            }
            System.out.println();
        }
    }
}