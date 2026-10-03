class Solution {

    public int longestValidParentheses(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int sb = 0;
        int eb = 0;
        int max = 0;

        // Left to right
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                sb++;
            } 
            else {
                eb++;
            }

            if (sb == eb) {
                max = Math.max(max, sb * 2);
            } 
            else if (eb > sb) {
                sb = 0;
                eb = 0;
            }
        }

        // Right to left
        sb = 0;
        eb = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '(') {
                sb++;
            } 
            else {
                eb++;
            }

            if (sb == eb) {
                max = Math.max(max, sb * 2);
            } 
            else if (sb > eb) {
                sb = 0;
                eb = 0;
            }
        }

        return max;
    }
}