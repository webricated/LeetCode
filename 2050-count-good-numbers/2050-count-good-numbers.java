public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPart = modPowRecursive(5, evenCount);
        long oddPart = modPowRecursive(4, oddCount);

        return (int)((evenPart * oddPart) % MOD);
    }

    // Recursive binary exponentiation
    private long modPowRecursive(long base, long exp) {
        if (exp == 0) return 1;

        long half = modPowRecursive(base, exp / 2);
        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}
