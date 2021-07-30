import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeOrNotHaker
{
   static int n=1001;
   static boolean prime[]=new boolean[n+1];
     public static void sieve(int n)
    {
        for(int i=0;i<=n;i++)
        {prime[i]=true;}
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
         sieve(n);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int n1;
        n1=sc.nextInt();
        if(prime[n1]==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        t--;
        }
    }

}
/*-----------------------------------------------------------------------------------------
3
100
7
35
Output:

no
yes
no*/
