import java.util.*;
class Factorial{ 
public static void main(String args[]){ 
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number for find factorial"); 
int num=scan.nextInt();
display();//calling method.
}
static void factorial(int num)
{
int i,f=1;
for(i=1; i<=num; i++){
f=f*i;
}
static void display()
{
factorial(num);   //nesting os methods.
System.out.print("Factorial of the "+num+"is "+f); 
}
}
}