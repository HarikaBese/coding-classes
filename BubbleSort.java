import java.util.*;
class BubbleSort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
 a[i]=sc.nextInt();
Bubble(a,n);
System.out.println("After Sorting:");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
static void Bubble(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
}
-----------------------------------------------------------------------------------------
Enter array size:
8
Enter array elements:
14 11 13 8 10 12 8 2 6
After Sorting:
2
6
8
8
10
11
12
13
14