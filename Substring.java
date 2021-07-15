import java.util.*;
import java.lang.*;
class String
{
public static void main(String args[])
{
String str,substr;
Scanner sc=new Scanner(System.in);
String str=new String();
System.out.println("Enter your String:");
str=sc.nextLine();
String substr=new String();
System.out.println("Enter sub String:");
substr=sc.nextLine();
if(substring(str,substr))
System.out.println("True");
else
System.out.println("Flase");
}
static boolean substring(String str,String substr)
{
for(int i=0;i<str.length ();i++)
{
for(int j=i+j;j<str.length ();j++)
{
if(str.substring(i,j).equals(substr))
return true;
}
}
return false;
}
}
