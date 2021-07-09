import java.util.*;
class Colmax
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
int l;
for(int i=0;i<c;i++)
{
l=a[0][i];
for(int j=1;j<r;j++)
{
if(l<a[j][i])
{
l=a[j][i];
}}
system.out.println("column"+(1+i)+"maximum: "+l);
}
}
}