import java.util.*;
class DupTrue
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
HashSet<Integer> s=new HashSet<Integer>();
int n=sc.nextInt();
System.out.println("Enter "+n+"value:");
for(int i=0;i<n;i++)
{
s.add(sc.nextInt());
}

for(int i=0;i<n;i++)
{
if(s.add(i)==false)
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}
}
}