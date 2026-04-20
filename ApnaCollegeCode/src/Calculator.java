import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operation to be performed: +, -, *, /, %");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
            System.out.println("Addition:"+ (a+b));
            break;
            case '-':
            System.out.println("Subtraction:"+ (a-b));
            break;
            case '*':
            System.out.println("Multiplication:"+ (a*b));   
            break;
            case '/':

            // * using if else
            // if(b==0)
            //     System.out.println("Division by zero is not allowed.");
            // else 
            //     System.out.println("Division:"+ (a/b));
            // break;

            // *using ternary (the best)
            System.out.println(b==0 ? "Division by zero is not allowed." : "Division:"+ (a/b));

            // ! the wrong one-
            // b == 0 ? System.out.println("Division by zero is not allowed.") : System.out.println("Division:" + (a / b));
            break;
            case '%':
            if(b==0)
                System.out.println("Modulus by zero is not allowed.");
            else 
                System.out.println("Modulus:"+ (a%b));
            break;
            default:
            System.out.println("Invalid operation entered");
        }

    }
}