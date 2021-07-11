import java.util.*;
public class Main
{
  public static void main (String[]args)
  { 
      Scanner sc=new Scanner(System.in);
    String s = new String ();
      System.out.println ("enter your String");
      s = sc.nextLine ();
    int weight = 0,n1;
    String s1 = s.toUpperCase ();
   char ch[] = s1.toCharArray ();
   System.out.println("enter 0 if you want to ignore vowels weight or Enter 1 if you want to include vowels weight");
   n1=sc.nextInt();
    for (int i = 0; i < ch.length; i++)
      {   
          if((int)ch[i]>64&&(int)ch[i]<=90)
          {  
             if(n1==0)         //n1==0 we ignore vowels weight
             {
              if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
              continue; 
              else 
              {   
                  int n = (int) ch[i] - 64;
	              weight += n;
              }
  }
              else if(n1==1)           //n1==1 we include vowels weight
              {
                  
              int n = (int) ch[i] - 64;
	              weight += n;
              }
          }
          
	
      }
      
      System.out.println(weight);

  }
}