import java.util.*;
import java.io.*;
class Noduplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array size and elements"); 
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int q=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;)
            {
                int c=0;
                if(a[i]==a[j])
                {
                   c=j;
                  for(int k=j;k<n-1;k++)
                a[k]=a[k+1];
                n--;
                }
            if(a[j]==a[i])
            j=c;
for(int k=j;k<n-1;k++)
                a[k]=a[k+1];
                n--;
                }
            if(a[j]==a[i])
            j=c;
            else
            j++;
            }
            if(q==0)
        System.out.println(a[i]+" ");
        q=0;
        }
    }
}
/*Output:
Enter array size and elements 5
1 1 2 3 3
2*/