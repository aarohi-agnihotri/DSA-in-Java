// 1) Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// 2) Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// 3) Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

//  all above are now made using string builder

import java.util.*;
class StrBuildPg{

    // pg1 for ques1
    static void pg1(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a size of an array");
        int size = sc.nextInt();  // input size of an array
        sc.nextLine();
        String str[] = new String[size];  // define string of array
        System.out.println("Input array of strings");
        for(int i=0; i<size; i++){
            str[i] = sc.nextLine();
        }
        //Can't directly pass a Str[] into a StringBuilder, pick 1 string or combine them first. It accepts a single String, not an array.
        // 2 methods to pass string of an array into stringBuilder object ------

        // if u want each array element in its own StringBuilder
        // StringBuilder sb = new StringBuilder(str[0]); // take first string

        // or using loop, here java forces to initialize because there is a path where sb would be used without ever getting a value, so java sees this possibility at compile time and protects you
        // StringBuilder sb = null; 
        // for(int i=0; i<size; i++){
        //      sb = new StringBuilder(str[i]);  // take one by one string
        //      System.out.println(sb);
        //     }
        // System.out.println(sb); // outside loop it prints the value of last index , so if want to print all of them , use inside

        // Second method - if u want all array strings combined into one stringBuilder
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i< size; i++){
        //     sb.append(str[i]);
        // }
        // System.out.println(sb);

        int totLength = 0;
        for(int i=0; i<size; i++){
            StringBuilder sb = new StringBuilder(str[i]);
            totLength += sb.length();
        }
        System.out.println("Cumulative length of array of strings: " +totLength);
        return;
    }

    // pg2 for ques2
    static void pg2(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a string");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == 'e')
            sb.setCharAt(i, 'i');
        }
        System.out.println(sb);
        return;
    }

    // pg3 for ques3
    static void pg3(){
        // how to take stringBuilder input from user => take a normal string from user using Scanner class, then pass it into stringBuilder constructor
        // we did this because, Scanner can only reads strings, not stringbuilder. StringBuilder is not an input type, its a class used for modifying strings. You always build it from a string
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you email"); 
        String email= sc.nextLine(); 
        StringBuilder sb = new StringBuilder(email);
        int pos = sb.indexOf("@");
        sb.delete(pos, sb.length());
        System.out.println(sb); 
        return;
    }


    public static void main(String args[]){
        pg1();
        // pg2();
        // pg3();
        
    }
}