import java.util.*;
class Factorial {

    //* Using return statement
    // int factorial(int n){
    //     if(n<0){
    //         System.out.println("factorial of negative numbers isn't possible");
    //         return 0;
    //     }
    //     else{
    //         if(n==1)
    //         return 1;
    //         return n* factorial(n-1);
    //     }
    // }

    // *using for loop
    int factorial(int n){
        if(n<0){
            System.out.println("factorial of negative numbers isn't possible");
            return 0;
        }
        else{
            int fact = 1;
            for(int i=1; i<=n; i++){
                 fact = fact*i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num for factorial");
        int num= sc.nextInt();
        int fact = obj.factorial(num);

        if(num>0)
        System.out.println(" factorial of"+ num + "is"+ fact);
    }
}
