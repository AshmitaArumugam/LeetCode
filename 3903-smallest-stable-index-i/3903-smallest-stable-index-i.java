class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int finals =Integer.MAX_VALUE;
        if(n==1)
        { if(0<=k)
            {
                return 0;
            }
            return -1;
        }
       int max=nums[0];
       int min;
        for(int i=0;i<n;i++)
        {
            min=nums[i];
            max=Math.max(nums[i],max);
            for(int j=i;j<n;j++)
            {
                min=Math.min(min,nums[j]);
            }
            int res=max-min;
            if(res<=k)
            {
                return i;
            }
        }
        return -1;
        
    }
}