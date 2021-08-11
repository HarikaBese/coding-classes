import java.util.*;
class SelectionSort
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
Selection(a,n);
System.out.println("After Sorting:");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
static void Selection(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
int min=i;
 for(int j=i+1;j<n;j++)
 {
  if(a[j]>a[min])
   min=j;
 }
 if(min!=i)
  {
    int t=a[i];
    a[i]=a[min];
    a[min]=t;
  }
}
}
}
/*-------------------------------------------------------------------------------------------
Enter array size:
7
Enter array elements:
4 18 1 16 2 16 21 13
After Sorting:
21
18
16
16
4
2
1*/