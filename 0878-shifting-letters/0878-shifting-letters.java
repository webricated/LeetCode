class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        int[] suffixSum = new int[n];
        StringBuilder sb = new StringBuilder();

        // Compute suffix sum in-place to save space
        suffixSum[n - 1] = shifts[n - 1] % 26;
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = (shifts[i] + suffixSum[i + 1]) % 26;
        }

        // Apply the shift to each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int shifted = ((ch - 'a') + suffixSum[i]) % 26;
            sb.append((char) ('a' + shifted));
        }

        return sb.toString();
    }
}
