mport java.util.*;
class Primearray {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>1)
            {
            c=0;
            for(int j=2;j<=a[i]/2;j++)
            {
                if(a[i]%2==0)
                c=-1;
            }
            if(c==0)
            System.out.print(a[i]+" ");
        }
    }
        System.out.println("there are no prime numbers in the array"); 
    }
/*Output:
4
3 4 6 8
3*/