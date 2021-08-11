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
if(a[j]<a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
}
/*-----------------------------------------------------------------------------------------
Enter array size:
7
Enter array elements:
45 8 14 1 52 16 2 10
After Sorting:
52
45
16
14
8
2
1*/