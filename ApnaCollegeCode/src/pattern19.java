// * inverted half pyramid - number pattern
import java.util.*;
class Pattern19{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        int num=1;
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                
            }
            num++;
            System.out.println();
        }
    }
}