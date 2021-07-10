import java.util.*;
class Swap
{
public static void main(String args[])
{
System.out.println("Enter size of Square matrices:");
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int m=s.nextInt();
int a[][]=new int[r][r];
int b[][]=new int[r][r];
for(int i=0;i<r;i++)
for(int j=0;j<r;j++)
a[i][j]=s.nextInt();
for(int i=0;i<r;i++)
for(int j=0;j<r;j++)
b[i][j]=s.nextInt();
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
a[i][j]=a[i][j]+b[i][j];
b[i][j]=a[i][j]-b[i][j];
a[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("After Swap of Matrices: ");
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();}
System.out.println("*******");
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}
/*Enter size of Square matrix:
  3 3
  10 15 13
  11 8  5
  9  4  3
1  44 6
87 65 43
54 91 12
After swap of matrices:
1  44 6
87 65 43
54 91 12
*******
10 15 13
11 8  5
9  4  3 */