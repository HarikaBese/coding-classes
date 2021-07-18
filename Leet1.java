class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> s=new TreeSet<Integer>();
        for(int i:nums)
        {
            if(i>0)
                s.add(i);
        }
        int c=1;
        for(int j:s)
        {
        
                if(j!=c)
                return c;
                else
                    c++;
            }
        return c;
    }
    }
-----------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Accepted
Runtime: 1 ms
Your input
[1,2,0]
Output
3