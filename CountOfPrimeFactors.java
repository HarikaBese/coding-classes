import java.util.*;
class PrimeFactorization
{
static int prime[]=new int[10001];
public static void sieve()
{
int i,p,j;
for(i=0;i<1001;i++){
prime[i]=i;}
prime[0]=1;
prime[1]=1;
for( p=2;p*p<1001;p++)
{
if(prime[p]==p)
{
for(j=p*p;j<1001;j+=p)
{
prime[j]=p;
}
}
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x;
int k=0;
int arr[]=new int[n];
while(n!=0)
{
x=prime[n];
arr[k]=x;
k++;
n=n/prime[n];
}
System.out.println("no.of prime Factors: ");
System.out.print(arr.length);
}
}
/*---------------------------------------------------------------------------------
255
no.of prime Factors: 4

75
no.of prime Factors: 3
*/

