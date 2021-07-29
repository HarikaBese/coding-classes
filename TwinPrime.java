import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    static int n=5000;
    public static int arr[]=new int[n];
    static boolean prime[]=new boolean[n+1];
    static void sieve(int n)
    {
        for(int i=0;i<=n;i++)
        {prime[i]=true;}
        prime[0]=false;
        prime[1]=false;
        for(int a=2;a*a<=n;a++)
        {
            if(prime[a]==true)
            {
                for(int i=a*a;i<=n;i+=a)
                {
                    prime[i]=false;
                }
            }
        }
int k=0;
for(int i=0;i<n;i++)
{
if(prime[i]==true)
{
arr[k]=i;
k++;
}
}
}
 public static void main(String args[])throws Exception{
 sieve(n);
int t;
BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
t=Integer.parseInt(buff.readLine());
while(t>0){
int l,r;
int sum=0,count=0;
String str[]=buff.readLine().trim().split("\\s+");
l=Integer.parseInt(str[0]);
r=Integer.parseInt(str[1]);
for(int i=0;i<=r;i++)
{
if((prime[i]==true)&&(prime[i+2])==true)
{
sum=arr[i+1]-arr[i];
if(sum==2)
count++;
}
}
System.out.println(count);
t--;
}
}
}
-------------------------------------------------------------------------------------------------
1
3 13
Output:3
