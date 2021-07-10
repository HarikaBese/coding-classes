import java.util.*;
class Sort
{
public static void main(String args[])
{
System.out.println("Enter size of Square matrices:");
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int a[][]=new int[r][r];
for(int i=0;i<r;i++)
for(int j=0;j<r;j++)
a[i][j]=s.nextInt();
int t=0;
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
for(int k=0;k<r-j-1;k++)
{
if(a[i][k]>a[i][k+1])
{
t=a[i][k];
a[i][k]=a[i][k+1];
a[i][k+1]=t;
}
}
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println();
}
}
}
/*Enter size of Square matrices:
3 3
10 15 13
11 8  5
9  4  3
 10 13 15
 5 8 11
 3 4 9*/