//Q6.Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                //% used as formatter
                //-15 15 characters left justified
                //0 adds extra zeros to int if needed
                //3 number of zeros
                //d integer
                //%n next line
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}
