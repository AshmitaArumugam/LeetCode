class Solution {
    long power(long x, long y, long mod) {
         if (y == 0)
            return 1;
       long half = power(x, y / 2, mod);
            half = (half * half) % mod;
        if (y % 2 == 1)
            half = (half * x) % mod;
            return half;
    }
    public int sumDecoded(long[] nums) {
        long mod = 1000000007;
        long ans = 0;
        int n = nums.length;
         for (int i = 0; i < n; i++) {
            String s = String.valueOf(nums[i]);
            int width = (int)(nums[i] % 10);
            String dst = s.substring(0, s.length() - 1);
            int x = Integer.parseInt(dst.substring(0, width));
            int y = Integer.parseInt(dst.substring(width));
            long val = power(x, y, mod);
            ans = (ans + val) % mod;
        }
      return (int)ans;
    }
}