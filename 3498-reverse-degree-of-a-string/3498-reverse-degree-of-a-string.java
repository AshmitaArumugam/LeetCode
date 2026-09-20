class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int index=1;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            sum+=(26-(ch-'a'))*index;
            index++;
        }
        return sum;
    }
}