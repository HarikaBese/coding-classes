import java.util.*;
class Prime
{
public static void main(String args[])
{
int n,i,j,c=0; 
System.out.println("Enter your Range lower and upper:");
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int u=s.nextInt();
for(i=l;i<=u;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
}
System.out.println(c);
}
}



