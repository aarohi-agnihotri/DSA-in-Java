// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.*;
class EmailStr{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input an email ");
        String emailId = sc.nextLine();
        String username = "";

        // first method - using charAt()
        // for(int i=0; i< emailId.length(); i++){
        //     if(emailId.charAt(i) == '@')
        //     username = emailId.substring(0, i);
        // }
        // System.out.println("Your username: " +username);

        // second method - using indexOf()
        int ind = emailId.indexOf('@');
        username = emailId.substring(0, ind);
        System.out.println("Your username: " +username);

    }
}