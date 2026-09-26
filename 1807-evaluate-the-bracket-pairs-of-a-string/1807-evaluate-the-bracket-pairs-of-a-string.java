class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder res= new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for(List<String> k : knowledge) {
            map.put(k.get(0), k.get(1));
        }

        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i) != '(') {
                res.append(s.charAt(i));
                i++;
            }
            else
            {
                int j=i+1;
                while(i<s.length() && s.charAt(j)!=')')
                {
                    j++; 
                }
                String key = s.substring(i+1,j);
                if(map.containsKey(key))
                {
                    res.append(map.get(key));
                }
                else
                {
                    res.append('?');
                }
                i=j+1;
            }
        }
        return res.toString();
    }
}