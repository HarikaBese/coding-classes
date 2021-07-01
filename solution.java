import java.util.*;
class solution
{
public static void main(String args[])
{
int n,a,b,r,rev=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
a=s.nextInt();
b=s.nextInt();
while(n>0)
{
r=n%10;
if(r==a)
rev=rev*10+b;
else
rev=rev*10+r;
n=n/10;
}
r=0;
while(rev>0)
{
r=rev%10;
n=n*10+r;
rev/=10;
}
System.out.println(n);
}
}