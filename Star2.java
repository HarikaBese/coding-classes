import java.util.*;
class Star2
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
for(i=n;i>=1;i--)
	    {
	        for(j=1;j<=i;j++)
	        {
	          System.out.print("*");  
	        }
	        
	        	System.out.println();
}
	      
	      

}
}


