// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

import java.util.*;
class BitsConversion{

    static void decimalToBinary(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if(n == 0 ){
        System.out.println("Decimal to binary is 0"); 
        return; }

        while(n != 0){
            sb.append(n % 2);  // it adds the bit to the end of ur stringBuilder
            n = n / 2;
        }
        System.out.println("Decimal to binary is");
        System.out.println(sb.reverse());
    }

    static void binaryToDecimal(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number in binary form");
        String str = sc.next();  //here i used string because if u entered binary, java still read it as decimal, and to work on individual digit u will convert into string, so better to tak input as string directly
        int sum = 0, power=0 ;
        for(int i=str.length()-1 ; i>=0; i--){
            int digit = str.charAt(i) - '0'; // standard way to convert a numeric character into its integer value,  her when we use charAt, we get the character and previously when i multiplied, its multiplied actually its ASCII value, so we have to convert it into integer, as ASCII value of 0 is 48, so any numeric chan minus 48 gives us its integer value
            // sum += digit * (int)Math.pow(2,power);  // i comment out this, because Math.pow is slow and uses double to int conversion
            sum += digit * (1 << power);  // (another way to get value of power of 2) fast pure integer, bit level operation
            power++;
        } 
        
        System.out.println("Binary to decimal is " + sum);
    }


    public static void main(String args[]){
        // decimalToBinary();
        binaryToDecimal();
    }
}