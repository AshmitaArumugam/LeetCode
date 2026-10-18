class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++)
        {
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        for(int i=0;i<k;i++)
        {
            lsum = lsum - cardPoints[k-i-1];
            lsum = lsum + cardPoints[n-i-1];
            maxsum=Math.max(lsum , maxsum);
        }
        return maxsum;
    }
}