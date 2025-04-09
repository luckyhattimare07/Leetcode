class Solution {
     private static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n/2 + n%2);
        long odd = n - even;
        
        long evenPow = modPow(5, even, MOD);
        long oddPow = modPow(4, odd, MOD);

        return (int)((evenPow * oddPow) % MOD);
    }

    // Fast modular exponentiation
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) { // if exp is odd
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1; // divide exp by 2
        }

        return result;
    
    }
}