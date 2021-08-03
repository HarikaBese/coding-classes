import java.util.*;
public class PrefixSumOfEven
{
public static void Prefix()
{
int a[]=new int[1000];
a[0]=2;
for(int i=1;i<=1000;i++)
{
a[i]=a[i-1]+2;

}
int pf[]=new int[1000];
pf[0]=a[0];
for(int i=1;i<=1000;i++)
{
pf[i]=pf[i-1]+a[i];
}
}
public static void main(String args[])
{ 
Prefix();
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int n=sc.nextInt();
while(t>0)
{
for(int i=0;i<=n;i++)
{
if(n!=0)
System.out.println(pf[i]);
}
t--;
}
}
}
----------------------------------------------------------------------------------
3 ---testcase
4 ---n value
20
10 ---n value
110
20 ---n value
420