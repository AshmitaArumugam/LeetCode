import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> set = new HashSet();
        for(int i : nums)
        {
            set.add(i);
        }
        int mul=k;
        for(int i : set)
        {
            if(!set.contains(mul))
            {
                return mul;
            }
            mul+=k;
        }
        return mul;
    }
}