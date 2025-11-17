import java.util.*;
class StrBuilder{
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter number");
        // int n=sc.nextInt();

        // passing our string "hello"
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb); // hello

        // char at index 0
        System.out.println(sb.charAt(0));  // get char, prints h

        // it throws compile error because setCharAt returns void, and u cannot print void or nothing , as u cannot pass void INTO println()
        // System.out.println(sb.setCharAt(0, 'M'));

        // replaces char at index (here u modify the object, returns void, u r not trying to print it so fine, u r printing actually object now)
        sb.setCharAt(0, 'M');  // set char
        System.out.println(sb); // Mello

        // insert string at specific index, (add before given pos)
        sb.insert(4,'s');  // insert char
        System.out.println(sb);  // Mellso

        // delete char, delete(start, end) -> removes substring between indices. (ending index is exclusive)
        sb.delete(4,5); 
        System.out.println(sb); // s removes at index 4

        // append the string, adds at end
        sb.append("world");
        System.out.println(sb); // melloworld
        
        // second example
        StringBuilder sb2 = new StringBuilder("j");
        sb2.append("a");
        sb2.append("v");
        sb2.append("a");
        System.out.println(sb2); // java

        // length of string
        System.out.println(sb.length()); // melloworld = 10 (0-9)

        // program for reverse a string

        // 1st method, using reverse() [best]
        StringBuilder str = new StringBuilder("hello");
        str.reverse();
        System.out.println(str); 

        // 2nd method, half loop [more efficient than 3rd one]
        StringBuilder str3 = new StringBuilder("swift");
        for(int i=0; i< str3.length()/2; i++){
            System.out.print(); 
        }

        // 3rd method, loop backward and print characters  [beginner, not recommend]
        StringBuilder str2 = new StringBuilder("cindrella");
        for(int i=str2.length()-1 ; i>=0 ; i--){
            System.out.print(str2.charAt(i)); 
        }
    }
}