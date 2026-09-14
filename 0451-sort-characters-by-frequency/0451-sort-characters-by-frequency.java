class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];

        for (char c : s.toCharArray()) 
        {
               freq[c]++;
        }
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int index=-1;
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < 128; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    index = j;
                }
            }
            for(int x=0;x<max;x++)
            {
                str.append((char)index);
            }
            if(index!=-1)
                freq[index]=0;
            
        }
        return str.toString();
    }
}