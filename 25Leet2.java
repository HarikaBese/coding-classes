
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
	{
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
		int i = 0;

        for(int n : nums1)
			setA.add(n);

        for(int n : nums2)
		{
            if(setA.contains(n))
			{
                setB.add(n);
            }
        }

        int[] result = new int[setB.size()];

		for(int n : setB){
            result[i] = n;
        i++;}

        return result;
    
        
    }
}
/*
Accepted
Runtime: 0 ms
Your input
[1,2,2,1]
[2,2]
Output
[2]
Expected
[2]*/