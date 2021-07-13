import java.lang.*;
import java.util.*;
class Main
{ 
    public static String Sortdesc(String str) 
    { 
        char [] Ans= str.toCharArray();
        Arrays.sort(Ans);
        String Answer="";
        for(int i=Ans.length-1;i>=0;i--)
        {
         Answer+=Ans[i];
        }
         System.out.println(Answer);
         return Answer;
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