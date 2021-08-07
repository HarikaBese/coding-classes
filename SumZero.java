import java.util.*;
class SumZero
{
public static boolean subArray(int n,int a[])
{
HashMap<Integer,Integer> hm=new HashMap<>();
int sum=0;
System.out.ptintln(n);
for(int i=0;i<n;i++)
{
sum+=a[i];
if(a[i]==0 || sum==0 ||hm.containsKey(sum))
return true;
hm.put(sum,1);
}
return false;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
subArray(n,a);
}
}
}
----------------------------------------------------------------------------------
5
4 2 -3 1 6
true

5
-3 2 3 1 6
false
