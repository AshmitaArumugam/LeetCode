class Solution {

    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int min = nums[0];
        int max = nums[0];

        int cl = 0;
        int cr = 0;

        for (int i = 0; i < n; i++) {

            if (max < nums[i]) {
                max = nums[i];
                cl = i;
            }

            if (min > nums[i]) {
                min = nums[i];
                cr = i;
            }
        }

        int res1 = Math.max(cl, cr) + 1;
        int res3 = n - Math.min(cl, cr);
        int res2 =Math.min(cl,cr)+1 + n - Math.max(cl,cr);
        return Math.min(Math.min(res1, res2), res3);
    }
}