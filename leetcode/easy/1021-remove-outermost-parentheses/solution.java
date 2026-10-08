class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (!st.isEmpty()) {   // only add if NOT outer
                    r += c;
                }
                st.push(c);
            } 
            else { // c == ')'
                st.pop();
                if (!st.isEmpty()) {   // only add if NOT outer
                    r += c;
                }
            }
        }
        return r;
    }
}