import java.util.*;
class TestClass {
    
   static int n=100001;
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
    public static void main(String args[] ) throws Exception {
        sieve(n);
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
       
       while(t>0)
       {         /*Every Even Positive Integer can be represented as sum of two primes.*/
        if((n%2==0) && (n<=100000))
        {
         if(n!=2)
         System.out.println("Deepa");
        }
        else
        {
        System.out.println("Arjit");
        }
        t--;
       }
     }
}
  
/*-----------------------------------------------------------------------------------------------------------
2
4
8

Deepa
Deepa
*/      