import java.util.*;
class Duplicate
{
public static void main(String args[])
{
System.out.println("Enter array size and elements:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
if(n==1||n==0)
System.out.print(n);
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
a[j]=a[n-1];
n--;
}
}
}
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}