import java.lang.*;
import java.util.*;
class Main
{ 
    public static void Sortdesc(String str) 
    { 
        char [] in= str.toCharArray();
        Arrays.sort(in);
        String Answer="";
        for(int i=0;i<in.length;i++)
        {
         Answer+=in[i];
        }
         System.out.println("After sorting: ");
         System.out.print(Answer);
         
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String st=sc.nextLine();
        Main obj=new Main();
        obj.Sortdesc(st);
    }
}