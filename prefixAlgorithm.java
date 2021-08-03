import java.util.*;
class NumArray {
public static void main(String args[])
{   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int nums[]=new int[n];
     for(int i=0;i<=n;i++){
      nums[i]=sc.nextInt();}
      int prefix[]=new int[n];
       if(n!=0)
       {
       
        prefix[0]=nums[0];
        for(int i=1;i<=n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
       
        
       }
       int l=sc.nextInt();
      int r=sc.nextInt(); 
      for(int i=0;i<=n;i++){
      if(l==0)
       System.out.println(prefix[r]);
      else
       System.out.println(prefix[r]-prefix[l-1]);}
    }
}
---------------------------------------------------------------------------------------------
-2 0 3 -5 2 -1
0 2
1
2 5
-1
0 5 
-3  
     
    


