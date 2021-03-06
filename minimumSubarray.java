class Solution {
    public int minSubArrayLen(int target, int[] nums)
    {
        
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int i=0,sum=0;
        int start=0;
        while(i<n){
            sum=sum+nums[i];
             if(sum>=target)
             { 
                 int temp=(i-start)+1;
                 if(temp<ans)
                 {
                     ans=temp;
                 }
                 sum=sum-nums[start];
                 sum=sum-nums[i];
                 start++;
             }
            else
            {
                i++;
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            ans=0;
        }
        return ans;
    }
}
------------------------------------------------------------
Accepted
Runtime: 0 ms
Your input
7
[2,3,1,2,4,3]
Output
2
Expected
2