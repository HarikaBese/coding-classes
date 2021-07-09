import java.util.*;
class Transpose
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
int b[][]=new int[r][c];
System.out.println("Transpose of a given matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
 b[i][j]=a[j][i];
System.out.print(" "+b[i][j]);
}
System.out.println();
}
}
}