// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;
class ReplaceLetterStr{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string ");
        String st = sc.nextLine();
        String result = "";
        // *built-in way
        // if u are replacing characters, use single quote '' , u can use double too and it works with substrings(multiple characters) too 
        // result = st.replace('e', 'i'); 
        // System.out.println(result);

        // *manual way
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == 'e')
            result += 'i';
            else
            result += st.charAt(i);
            
        }
        System.out.println(result);
    }
}