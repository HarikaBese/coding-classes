import java.util.*;
class Rangesum
{
public static void main(String args[])
{
System.out.println("Enter array size and elements:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Enter left and Right Index:");
int l=sc.nextInt();
int r=sc.nextInt();
int s=0;
if(n>0&&l<n&&l<=r&&r<n&&r>=1)
{
for(int i=1;i<=r;i++)
s=s+a[i];
}
System.out.println(s);
}
}