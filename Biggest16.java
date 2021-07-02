import java.util.*;
class Biggest16
{
public static void main(String args[])
{
System.out.println("Enter your 16 values");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
int f=s.nextInt();
int g=s.nextInt();
int h=s.nextInt();
int i=s.nextInt();
int j=s.nextInt();
int k=s.nextInt();
int l=s.nextInt();
int m=s.nextInt();
int n=s.nextInt();
int o=s.nextInt();
int p=s.nextInt();
int b1=(int)(Math.max(Math.max(a,b),Math.max(c,d)));
int b2=(int)(Math.max(Math.max(e,f),Math.max(g,h)));
int b3=(int)(Math.max(Math.max(i,j),Math.max(k,l)));
int b4=(int)(Math.max(Math.max(m,n),Math.max(o,p)));
int a1=(int)(Math.max(Math.max(b1,b2),Math.max(b3,b4)));
System.out.println(" "+a1);
}
}