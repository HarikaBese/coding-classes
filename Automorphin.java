import java.util.*;
public Automorphin
{
	public static void main(String args[]) {
	 int n;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	int n1=n*n;
	int re,rem1;
	re=n%10;
	rem1=n1%10;
	if(re==rem1)
	{
	    System.out.println("Automorphic");
	}
	else 
	{
	   System.out.println("Not Automorphic");  
	}
	
	}
}
/* output:
55
Automorphic
*/