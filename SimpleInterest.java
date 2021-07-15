import java.util.*;
class A
{
public static void main(String args[])
{
System.out.println("Enter p,t,r values:");
Scanner s=new Scanner(System.in);
float p=s.nextFloat();
float t=s.nextFloat();
float r=s.nextFloat();
simpleInterest(p,t,r);
}
public static void simpleInterest(float p,float t,float r)
{
float a=p*t*r;
float i=a/100;
System.out.println("Simple Interest: "+i);
}
}
/* Enter p,t,r values:
200 23.5 5.4
Simple Interest: 253.8 */