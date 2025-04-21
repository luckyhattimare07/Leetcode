class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow
        }
        double ans=(dividend/divisor);
        int ans1=(int) ans;
        return ans1;
    }
}