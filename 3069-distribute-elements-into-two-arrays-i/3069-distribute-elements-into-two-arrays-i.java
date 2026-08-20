class Solution {
    public int[] resultArray(int[] nums) {
        int n= nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int j = 1;
        int k = 1;

        for (int i = 2; i < n; i++) {

            if (arr1[j - 1] > arr2[k - 1]) {
                arr1[j] = nums[i];
                j++;
            } 
            else {
                arr2[k] = nums[i];
                k++;
            }
        }
        int[] res = new int[n];
        int x=0;
        for(int i=0;i<j;i++)
        {
            res[x]=arr1[i];
            x++;
        }
        for(int i=0;i<k;i++)
        {
            res[x]=arr2[i];
            x++;
        }
        return res;
    }
}