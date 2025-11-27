// Tower of hanoi
import java.util.*;
class TowerofHanoi {

    static void toh(int n, char src, char helper, char des){
        if(n == 1){
            System.out.println("transfer disk " +n+ " from " +src+ " to " +des); 
            return;
        }
        
        toh(n-1, src, des, helper);
        System.out.println("transfer disk " +n+ " from " +src+ " to " +des); 
        toh(n-1, helper, src, des);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for TOH program"); 
        int n = sc.nextInt(); 
        
        toh( n, 'S', 'H', 'D');
    }
}