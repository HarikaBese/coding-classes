import java.util.*;
class Linked
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter n value:");
LinledList<Integer> v=new LinkedList<Integer>();
int n=s.nextInt();
System.out.print("Enter "+n+" value:");
for(int i=0;i<n;i++)
v.add(s.nextInt());
System.out.print("Enter value to search: ");
int a=s.nextInt();
if(v.contains(a))
{
for(int i=0;i<n;i++)
v.remove(a);
System.out.print("List after Deletion: ");
System.out.print(v);
}
else
System.out.print("Element not found");
}
}
/*
Enter n value:  5
Enter 5 values: 10 20 30 40 50
Enter value to search: 30
List After Deletion: 10 20 40 50
Enter n value: 5
Enter 5 values: 10 20 30 40 50
Enter value to search: 3
Element Not found*/