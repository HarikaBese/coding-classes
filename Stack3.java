import java.util.*;
import java.util.Stack;
class Stack3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Stack<Integer> s=new Stack<Integer>();
System.out.println("Enter array size");
int n=sc.nextInt();
System.out.println("Enter array elements:");
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
s.push(a[i]);
System.out.println(s);
int odd=0,even=0;
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
even++;
if(a[i]%2==1)
odd++;
}
if(odd==even)
System.out.println("Stack is Balanced");
else
System.out.println("Stack is not Balanced");
}
}
/*
Enter array size
4
Enter array elements:
1 2 3 4
[1, 2, 3, 4]
Stack is Balanced

Enter array size
5
Enter array elements:
2 3 4 5 6
[2, 3, 4, 5, 6]
Stack is not Balanced
*/

