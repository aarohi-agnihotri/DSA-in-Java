import java.util.*;
class Recursion {

    // *printing n to 1
    static void printNum(int n){
        if(n == 0)
        return;
        System.out.println(n);
        printNum(n-1);
    }

    //* printing 1 to n
    static void printNum2(int n, int i){
        if(i>n)
        return;
        System.out.println(i);
        printNum2(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // printNum(n);
        printNum2(n, 1);
    }
}