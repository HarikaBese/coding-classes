import java.util.*;
class Alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char ch='A';
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(ch+" ");
ch++;
}
System.out.println();
}
}
}

















