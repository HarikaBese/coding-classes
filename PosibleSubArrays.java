import java.util.*; 
class PosibleSubArrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);								int n=sc.nextInt();				
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        int arr[] = sc.nextInt();
        }																				
       int arrSize = arr.length;
        for (int i = 0; i <arrSize ; i++) {
          
            for (int j = i; j <=arrSize ; j++) {
                
                for (int k = i ; k < j ; k++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }

    
    }

-----------------------------------------------------------------------------------------
output
3
1 2 3
1
1 2
1 2 3
2
2 3
3 
