class Solution {
    public int countCommas(int n) {
     int res=n;
     int count=0;
     while(res>0)
     {
        res=res/10;
        count++;
     }  
     if(count<=3)
     {
        return 0;
     }
     return (n-1000)+1;
    }
}