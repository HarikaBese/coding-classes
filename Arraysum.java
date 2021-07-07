import java.util.*;
class Arraysum
{
public static void main(String args[])
{
System.out.println("Enter array size and elements:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int s=0;
for(int i=0;i<=n-1;i++)
{
for(int j=0;j<=i;j++)
{
s=s+a[j];
}
}System.out.println(s+" ");
}
}