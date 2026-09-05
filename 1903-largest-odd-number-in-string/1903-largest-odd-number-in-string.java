class Solution {
    public String largestOddNumber(String num) {
    int nums = 0;
    for (int i = 0; i < num.length(); i++) {
        nums = nums * 10 + (num.charAt(i) - '0');
    }
    if((nums%10)%2!=0)
    {
        return num;
    }
    int max =Integer.MIN_VALUE;
    boolean found=false;
    int i = num.length() - 1;

        while (i >= 0) {

            int rem = num.charAt(i) - '0';

            if (rem % 2 != 0) {
                return num.substring(0, i + 1);
            }

            i--;
        }
    if(!found)
    {
        return "";
    }
    return String.valueOf(max);
    }
}