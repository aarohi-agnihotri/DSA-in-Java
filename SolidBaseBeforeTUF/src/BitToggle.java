// Write a program to toggle a bit a position = “pos” in a number “n”.
// for toggle , we use XOR (^) operation, because -
// XOR compares two bits and returns 1 only when bits are different.
// So , if 0 ^ 0 = 0,  0 ^ 1 = 1,  1 ^ 0 = 1,  1 ^ 1 = 0
// So when u XOR any bit with 1, it flips : 0 ^ 1 = 1,  1 ^ 1 = 0
// And when u XOR any bit with 0, it stays : 0 ^ 0 = 0,  1 ^ 0 = 1
// So, XOR with a mask that has single 1 only flips that and nothing else. This is why toggle = XOR

import java.util.*;
class BitToggle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Enter position of a number u want to toggled");
        int pos=sc.nextInt();

        int bitmask = 1 << pos;
        int result = n ^ bitmask;
        System.out.println(result);
    }
}