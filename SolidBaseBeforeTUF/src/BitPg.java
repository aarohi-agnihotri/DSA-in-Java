import java.util.*;
class BitPg{
    static void getBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0)
        System.out.println("bit was 0");
        else
        System.out.println("bit was 1");
        return;
    }

    static void setBit(){
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
        return;
    }

    static void clearBit(){
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notOfBitMask = ~(bitMask);
        int newNum = notOfBitMask & n;
        System.out.println(newNum);
    }

    static void updateBit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("If want to update bit to 1, then enter 1 , else 0");
        int oper = sc.nextInt();
        int n = 5, newNum;
        int pos= 1;
        int bitMask = 1 << pos;
        if(oper == 1){
             newNum = n | bitMask;
        }
        else{
            int notOfBitMask = ~(bitMask);
             newNum = notOfBitMask & n;
        }
        System.out.println(newNum);
    }
    
    public static void main(String args[]){
        // getBit();
        // setBit();
        // clearBit();
        updateBit();
        }
    }