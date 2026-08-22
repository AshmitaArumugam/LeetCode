class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int res1=n;
        int prod=1;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;

        }
        int res2=sum+prod;
        return res1%res2==0;
    }
}