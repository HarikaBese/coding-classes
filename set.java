import java.util.*;
class Set
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter n value:");
Vector<Integer> v=new Vector<Integer>();
int n=s.nextInt();
System.out.println("Enter "+n+"value:");
for(int i=0;i<n;i++)
v.add(s.nextInt());
System.out.print("Enter value in array,update value: ");
int a=s.nextInt();
int r=s.nextInt();
if(v.contains(a))
{
for(int i=0;i<=n-1;i++)
{
int index=v.indexOf(a);
v.set(index,r);
}
System.out.println(v);
}
else
System.out.println("False");
}
}
/*Enter n value:  5
  Enter 5 values:  10   20  30   40  50
  Enter value in array , update value:   20   99
  10   99   30  40   50
 Enter n value:  5
 Enter 5 values:  10   20  30   40  50
 Enter value in array , update value:   2   99
 False
*/