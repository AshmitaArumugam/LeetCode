class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            else if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(min))
            {
                res.add(min);
            }
            min++;
        }
        return res;
    }
}