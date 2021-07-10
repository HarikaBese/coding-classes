import java.util.*;
class Differ
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int c=s.nextInt();
int a[][]=new int[r][c];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=s.nextInt();
int s1=0,s2=0;
for(int i=0,j=0;i<r;i++,j++)
{
s1+=a[i][j];
}
System.out.println("sum of diagnol: "+s1);
for(int i=0,j=r-1;i<r;i++,j--)
{
s2+=a[i][j];
}
System.out.println("sum of Anti diagnol: "+s2);
System.out.println("Difference=sum of diagnol-sum of Anti diagnol: "+(s1-s2));
}
}
/*3 3
10 15 13
11 8  5
9  4  3
sum of Diagnol:21
sum of Anti Diagnol:30
Difference=sum of Diagnol-sum of Anti Diagnol: -9*/