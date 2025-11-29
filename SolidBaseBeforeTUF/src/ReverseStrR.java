// Print a string in reverse
import java.util.*;
class ReverseStrR {

    // Method 1: Remove first char, reverse rest
    static String getReverse(String str){
        // if(str.length() == 0) return;
        if(str.isEmpty()) return "";
        
        return getReverse(str.substring(1)) + str.charAt(0);
    }
    
    // Method 2: Process the Last Char and Then Make Recursive Call
    static String getReverse2(String str){
        if(str.isEmpty()) return str;
        
        return str.charAt(str.length() - 1) + getReverse2(str.substring(0, str.length()-1)) ;
    }
    
    // Method 3: Optimized- Process from Both Ends
    static String getReverse3(String str){
        if(str.length() == 0) return "";

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string"); 
        String str = sc.nextLine();
        System.out.println("Reversed string: "+getReverse(str)); 
        System.out.println("Reversed string: "+getReverse2(str)); 


        // System.out.println(str); //aarohi 
        // System.out.println(str.length());  //6
        // System.out.println(str.length() - 1);  //5
        // // System.out.println(str.charAt(str.length()));   //error
        // System.out.println(str.charAt(str.length() - 1)); //i 
        // System.out.println(str.substring(0, str.length()));  // aarohi (0,6)
        // System.out.println(str.substring(0, str.length()-1)); //aaroh (0,5)
        // System.out.println(str.substring(str.length()-1)); // i (5th index)
    }
}