class Solution {
    public long countCommas(long n) {

        long total = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {

            long end = start * 1000 - 1;

            if (end > n) {
                end = n;
            }

            total += (end - start + 1) * commas;

            start = start * 1000;
            commas++;
        }

        return total;
    }
}