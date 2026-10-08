class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                if(p>0)
                {
                str.append(c);
                }
                p++;
                
            }
            else
            {
                 p--;
                if(p>0)
                     str.append(c);
            }
        }
        return str.toString();
    }
}