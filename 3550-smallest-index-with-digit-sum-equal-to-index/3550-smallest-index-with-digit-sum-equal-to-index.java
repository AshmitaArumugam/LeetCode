class Solution {
    public int smallestIndex(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
        int sum=0;
        int a=nums[i];
        if(a>=10)
            {
                while(a!=0)
                {
                sum=sum+(a%10);
                a=a/10;
                }
                if(sum==i)
                {
                    return i;
                }
            }
        else if(a==i)
        {
            return i;
        }
    }
    return -1;
    }
}