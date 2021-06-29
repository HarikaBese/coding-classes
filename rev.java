public class Solution {

    public static void main(String[] args) {
        int i,rev=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
              {
                  i=n%10;
                  rev=(rev*10)+i;
                  n=n/10;
              }
              System.out.println(""+rev);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}