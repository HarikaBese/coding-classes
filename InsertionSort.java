import java.util.*;
class InsertionSort
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
insertion(a,n);
System.out.println("After Sorting:");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
static void insertion(int a[],int n)
{
for(int i=1;i<n;i++)
{
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp)
{
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
}
--------------------------------------------------------------------------------------------
Enter array size:
7
Enter array elements:
4 12 3 8 1 2 89
After Sorting:
1
2
3
4
8
12
89

} 
