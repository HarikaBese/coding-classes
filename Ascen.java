import java.util.*;
class Ascen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string");
String str=sc.nextLine();
char ch[]=str.toCharArray();
Arrays.sort(ch);
System.out.print("After sorting in Ascending Order:");
System.out.print(ch);
}
}
