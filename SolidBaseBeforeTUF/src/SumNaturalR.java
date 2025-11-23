import java.util.*;
class SumNaturalR {


    //* sum of first n natural numbers, first way
    // static int sumNatural(int n, int sum, int i){
    //     if(i > n){
    //         return sum;
    //     } 

    //     sum += i;
    //     return sumNatural(n, sum, i+1);
    // }

    // * same but with improvement
    static int sumNatural(int n, int i){
        if(i > n){
            return 0;
        } 

        return i+ sumNatural(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // * first 
        // int i = 1, sum = 0;
        // int tot = sumNatural(n, sum, i);
        // System.out.println(tot);

        // *second
        System.out.println(sumNatural(n, 1));
    }
}