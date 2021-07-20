import java.util.*;
class HashFreq
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
countfreq(a,n);
}
public static void countfreq(int arr[],int n)
{
HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
if(h.containsKey(a[i]))
h.put(a[i],h.get(a[i]+1));
else
h.put(a[i],1);
}
System.out.print(h);
}
}
/*
output:
2 3 4 5 6 4 7 4 5 6 6
4 4
5 2
6 3*/