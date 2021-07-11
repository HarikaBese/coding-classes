// java program to convert given string to lower case // date: 10 july 2021
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    String s=new String();
	    Scanner sc=new Scanner(System.in);
	    s=sc.nextLine(); // taking string input
	    String op=s.toLowerCase(); // converting to lower case using predefined method
	    /* similarly, we can print upper case format of given string using:
	    String out=s.toUpperCase(); */
	    System.out.println(op);
	}
}