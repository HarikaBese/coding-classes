Java code online
import java.util.*;
class Majority {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=1,c1=0,x=0;
            int n1=n;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;)
                {int p=0;
                if(a[i]==a[j])
                p=j;
                c++;
                for(int k=j;k<n-1;k++)
                {
                a[k]=a[k+1];
                }
                n--;
            }
            if(a[j]==a[i])
 j=p;
            else
            j++;
        }
        if(c>n1/2)
        {
            c1=c;
            x=i;
            break;
        }
        c=1;
        }
        if(c1==0)
        System.out.println("there is no majority element"); 
        else
        System.out.println(a[n]+" is the majority element");
    }
}
/*Output: 3
2 1 2
2 is the majority element
2 nd dhi*/