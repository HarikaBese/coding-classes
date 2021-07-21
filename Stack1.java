import java.util.*;
import java.util.Stack;
class Stack1
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
System.out.println("Array elements are added to the Stack:");
System.out.println(s);
}
}
/*
Enter array size
5
Enter array elements:
10 20 30 40 50
Array elements are added to the Stack:
[10, 20, 30, 40, 50]
*/