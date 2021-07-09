import java.util.*;
class Colsum
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
for(int i=0;i<c;i++)
{
int sum=0;
for(int j=0;j<r;j++)
{
sum+=a[j][i];
}
System.out.println("column"+(i+1)+"sum: "+sum);
}
}
}
