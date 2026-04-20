import java.util.*;
class Sum{

    // *to call without an object, u have to make called function - static type
    static int sumOfTwo(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int total = sumOfTwo(x,y);
        System.out.println(total);
    }

    // * In case when u call non static method, u have to make object to call it
    // int sumOfTwo(int a, int b){
    //     int sum= a+b;
    //     System.out.println(sum);
    //     return sum;
    // }

    // public static void main(String args[]){
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter two numbers");
    //     int x= sc.nextInt();
    //     int y= sc.nextInt();
    // *    Sum obj = new Sum();
    //  *   obj.sumOfTwo(x,y);
    // }
}