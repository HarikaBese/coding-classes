import java.util.*;
import java.util.Stack;
class Stack2
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
System.out.println("Stack with out odd numbers:");
Stack<Integer> odd=new Stack<Integer>();
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
odd.push(a[i]);
}
System.out.println(odd);
}
}
/*
Enter array size
5
Enter array elements:
1 2 3 4 5
[1, 2, 3, 4, 5]
Stack with out odd numbers:
[2, 4]
*/