// * floyd's triangle
import java.util.*;
class Pattern8{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        int num=1;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}