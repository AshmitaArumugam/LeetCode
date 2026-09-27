class Solution {
    public String reverseParentheses(String s) {

        StringBuilder str = new StringBuilder(s);

        while (str.indexOf("(") != -1) {

            int open = str.lastIndexOf("(");
            int close = str.indexOf(")", open);

            // Reverse characters between open and close
            int left = open + 1;
            int right = close - 1;

            while (left < right) {
                char temp = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, temp);

                left++;
                right--;
            }

            // Remove ')' first
            str.deleteCharAt(close);

            // Remove '('
            str.deleteCharAt(open);
        }

        return str.toString();
    }
}