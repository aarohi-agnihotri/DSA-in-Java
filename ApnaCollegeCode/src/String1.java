// Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

import java.util.*;
class String1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //* String Declaration
        String name = "JJ";
        String surname = "Thomsan";
        String sentence = "My name is JJ Thomsan";

        // *concatenation is joining two or more strings to form a single string
        String fullName = name + " " + surname;
        // System.out.println(fullName);

        // *using concat() method
        String concatExample = "hello".concat("world");
        // System.out.println(concatExample);

        String s1 = "hi";
        String s2 = "namaste";
        String concatExample2 = s1.concat(s2);
        // System.out.println(concatExample2);


        // *to get length of string
        // System.out.println(fullName.length());
        
        // input string from user
        // String urName = sc.next(); 
        // String name2 = sc.nextLine(); 

        // System.out.println(urName); //JJ
        // System.out.println(name2); // Thomsan (the output we want actually doesn't print because -)
        // next() stops at space → leaves " Thomsan" in buffer.
        // nextLine() then reads that leftover part (with space).

        // *next() - Reads only one word (until a space, tab, or newline). Stops reading when it hits whitespace. Ignores leftover newline characters.
        //* nextLine() - Reads the entire line, including spaces, until the user presses Enter. Useful for full sentences or multi-word strings.

        // *Access characters of a string - charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // *before go to comparison we should know this-
        // heap memory is like a big storage area where java stores objects(like strings, arrays, or any new created objects) while ur program runs 
        // heap memory managed by Garbage Collector (GC) - it removes objects from memory that are no longer needed or not referenced by an variable or no variable point to them. One example-
        String eg= new String("hi");
        eg = "hey"; // old "hi" object is now unreferenced, so it is eligible for GC                                                                   
        // String pool is a special memory area inside heap memory where string literals are uniquely stored to save memory.

        //  * comparison using equals() method - comparing 2 strings by their characters
        // String comp1 = "hello";
        // String comp2 = "hello";

        //*  in this situation java checks the string pool first, if "hello" already exists, it reuses the same object, so comp1 and comp2 points to same "hello" in the pool
        // System.out.println(comp1.equals(comp2)); // true

        // * int his situation, "new" forces java to make new object outside the pool, even if "hello" already exists there
        // String comp3 = new String("hello");
        // System.out.println(comp1.equals(comp3)); // true

        // *comparison using "==" - comparing 2 strings by their memory location means check whether variables are in same location or not [not recommend to use to check for string equality]
        // String comp1 = "hello";
        // String comp2 = "hello";
        // System.out.println(comp1 == comp2); // true
        // String comp3 = new String("hello"); // created using new, which makes new object in different memory location
        // System.out.println(comp1 == comp3); // false
      

        // *comparison using compareTo(), compares two strings alphabetically (a comes before b, so a is small) and returns a number showing which comes first. (it works like comparing the unicode value of each character until it finds a first difference and then stop)
        // 0 when both are equal
        // +ve = string1 comes after string2
        // -ve = string1 comes before string2
        // * A to Z = 65 to 90 and a to z = 97 to 122

        // String word1 = "banana";
        // String word2 = "canana";
        // System.out.println(word1.compareTo(word2)); // -1  
        // System.out.println("set".compareTo("Set"));  // 32
        // System.out.println("man".compareTo("man")); // 0 
        // System.out.println("remote".compareTo("extra")); // 13

        //* Substring is used to extract part of a string. Syntax:
        // string.substring(startIndex);
        // string.substring(startIndex, endIndex);
        // rules - index start from 0. startIndex included . endIndex excluded

        String word = "computer";
        System.out.println(word.substring(3)); // puter (if u not mention lastIndex, its included so outputs from mentioned startIndex to endIndex)
        System.out.println(word.substring(0, 4)); // comp (4th index excluded)
        // word.substring(10); // error - string index out of bounds exception
        
        // * In java strings are immutable that means u can't changed the contents created string, u have to create a new string variable to store the changes of old one and java automatically created a new string object when changes are made in string

        // *ParseInt method- used to convert a string to int 
        // Parse means to read and interpret text
        // so parseInt reads number from text and toString turns number into string
        // Integer is wrapper class, to wrap primitive data types  into object form , needed when working with arrayList and methods that accepts only objects and it's full object that contains useful methods too
        int num = Integer.parseInt("123");
        System.out.println(num + 5);
        
        // *ToString method - used to convert int to string
        // should be a valid number in both methods, otherwise error thrown
        int n = 145;
        String str = Integer.toString(n);
        System.out.println(str);
        }

    
    }


