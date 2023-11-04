/*This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int c=A.length()+B.length();
        System.out.println(c);
        int d = A.compareTo(B);
        if(d >= 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(cap+" ");
        System.out.print(cap2);
        
    }
}
