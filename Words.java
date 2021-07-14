import java.util.*;
class words
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
if (str== null || str.isEmpty())
 { 
 System.out.print("empty string");
 }
 String a[]=str.split(" "); 
  System.out.print(" "+a.length);
 }
}