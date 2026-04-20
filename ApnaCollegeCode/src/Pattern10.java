import java.util.*;
class Pattern10{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int r=sc.nextInt();

        // First outer part
        for(int i=1; i<=r; i++){

            // inner part , for star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // inner part, for space
            int spaces= 2*(r-i);
            for(int k=1; k<=spaces; k++){
                System.out.print(" ");
            }
            // again inner part , for star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second outer part or lower part
        for(int i=r; i>=1; i--){

            // inner part , for star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // inner part, for space
            int spaces= 2*(r-i);
            for(int k=1; k<=spaces; k++){
                System.out.print(" ");
            }
            // again inner part , for star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}