import java.util.*;
class A
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Size of array:");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0;i<size;i++)
a[i]=s.nextInt();
System.out.println("Enter the number whose frequency you want:"); 
int n=s.nextInt();
frequency(size,a,n);
}
public static void frequency(int size,int[] a,int n)
{
int c=0;
for(int i=0;i<size;i++)
{
if(a[i]==n)
c++;
}
System.out.println(c);
}
}
/*Enter Size of array: 5
Enter array elements: 2 3 3 4 5
Enter the number whose frequency you want: 3
 2*/