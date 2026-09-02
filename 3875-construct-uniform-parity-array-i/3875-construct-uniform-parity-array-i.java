class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int[] nums2 = new int[n];
        int ce=0;
        int co=0;
        for(int i=0;i<n;i++)
        {
            if(nums2[i]%2==0)
            {
                ce++;
            }
            else
            {
                co++;
            }
        }
        if(co==n || ce==n)
        {
            return true;
        }

        nums2[0] = nums1[0];
        for(int i=1;i<n;i++)
        {
            if(nums1[i]%2!=0)
            {
                nums2[i]=nums1[i-1]-nums1[i];

            }
            else
            {
                nums2[i]=nums1[i];
            }
        }
        ce=0;
        co=0;
        for(int i=0;i<n;i++)
        {
            if(nums2[i]%2==0)
            {
                ce++;
            }
            else
            {
                co++;
            }
        }
        return (co==n)||(ce==n);
    }
}