// java program to reverse the given string // date: 10 july 2021
import java.util.*;
import java.lang.String;
class Main {

    public static void reverseString(char[] s) {
         int n = s.length-1;
        for(int i = 0; i <= n/2; i++){
            char temp = s[i];
            s[i] = s[n-i];
            s[n-i] = temp;} 
            String s2=new String(s);
            System.out.println("After Reversing given string: ");
            System.out.println(s2);
    }
    public static void main(String args[])
    {
     Scanner p=new Scanner(System.in);
     System.out.println("Enter your String:");
     String s=new String();
     s=p.nextLine();
     char c[]= s.toCharArray();
     reverseString(c);
     }
    }