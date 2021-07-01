import java.util.*;
class Harshad
{
public static void main(String args[])
{
System.out.println("Enter a number:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=n,sum=0,r;
while(x>0)
{
r=x%10;
sum=sum+r;
x=x/10;
}
if(n%sum==0)
System.out.println("Given number is Harshad number");
else
System.out.println("Given number is not Harshad number");
}
}