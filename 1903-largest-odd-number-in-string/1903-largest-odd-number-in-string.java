class Solution {
    public String largestOddNumber(String num) {
    if ((num.charAt(num.length() - 1) - '0') % 2 != 0)
    {
        return num;
    }
    boolean found=false;
    int i = num.length() - 1;

        while (i >= 0) {

            int rem = num.charAt(i) - '0';

            if (rem % 2 != 0) {
                return num.substring(0, i + 1);
            }

            i--;
        }
    return "";
    }
}