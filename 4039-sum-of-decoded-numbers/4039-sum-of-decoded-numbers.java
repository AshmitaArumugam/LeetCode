class Solution {
    public int sumDecoded(long[] nums) {

        long MOD = 1000000007;
        long total = 0;

        for (int i = 0; i < nums.length; i++) {

            long width = nums[i] % 10;
            long d = nums[i] / 10;

            int digits = String.valueOf(d).length();

            long divisor = 1;

            for (int j = 0; j < digits - width; j++) {
                divisor *= 10;
            }

            long x = d / divisor;
            long y = d % divisor;

            // Calculate x^y % MOD
            long res = 1;
            long base = x;

            while (y > 0) {

                if (y % 2 == 1) {
                    res = (res * base) % MOD;
                }

                base = (base * base) % MOD;
                y = y / 2;
            }

            total = (total + res) % MOD;
        }

        return (int) total;
    }
}