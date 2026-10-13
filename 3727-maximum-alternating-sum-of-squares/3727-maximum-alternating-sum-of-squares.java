class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long score=0;
        for(int i=0;i<nums.length;i++)
        {
            long square=(long)nums[i];
            if(i>=n/2)
            {
                score+=square;
            }
            else
            {
                score-=square;
            }
        }
        return score;
    }
}