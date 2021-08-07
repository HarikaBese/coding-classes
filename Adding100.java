import java.util.*;
class Adding100
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int m=sc.nextInt();

while(m>0)
{
int u=sc.nextInt();
int l=sc.nextInt();
for(int i=u-1;i<=l-1;i++)
{
a[i]=100+a[i];
}
m--;
}
Arrays.sort(a)
System.out.println(a[n-1]);
}
}

----------------------------------------------------------------------------------------
5
0 0 0 0 0
3
2 1
1 3
1 2
300
