//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
class Circumference{
    static AreaOfCircle(double radius){
        return 2*3.14*radius;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        int r=sc.nextInt();
        double ans = AreaOfCircle(r);
        System.out.println(ans);
    }
}