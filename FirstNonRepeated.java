import java.util.*;
class FirstNonRepeated{
public static void main(String args[])
{
Stack<Character> stack=new Stack<Character>();
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter your String");
String s1=s.nextLine();
char ch[]=s1.toCharArray();
for(i=0;i<s1.length();i++)
stack.push(ch[i]);
for(i=0;i<s1.length();i++)
{
if(ch[i]!=ch[i+1])
System.out.println(stack.get(i));
else
System.out.println("-1");
break;
}
}
}	
/*
Enter your String
leetcode
0
*/