import java.util.*;
class Secondmax
{
public static void main(String args[])
{
System.out.println("Enter array Length:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i;
System.out.println("Enter array Elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();}
for(i=0;i<n;i++)
{
for(int y=i+1;y<n;y++)
{
if(a[i]<a[y])
{
int max=0;
    max=a[i];
    a[i]=a[y];
    a[y]=max;
}}}
System.out.println("Second Maximum number:"+a[n-2]);
}
}