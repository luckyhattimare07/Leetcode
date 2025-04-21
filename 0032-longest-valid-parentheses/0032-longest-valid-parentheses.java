class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> q = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==')' && !q.isEmpty() && s.charAt(q.peek()) == '(')q.pop();
            else q.push(i);
        }
        int res = 0;
        int end = n-1;
        while( !q.isEmpty()){
            int start = q.pop();
            res = Math.max(res, end-start);
            end = start-1;
        }
        return Math.max(res, end +1);
    }
}