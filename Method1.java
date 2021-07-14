import java.util.*;
class Prime
{
 public static int primeNos(int n)
{
if(n<=1)
{
for(int i=1;i<=n;i++)
{
int c=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
System.out.print(i);
}
}
}
public static void main(String args[])
{
int i;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
primeNos(n);
}
}