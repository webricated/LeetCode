class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] val = s.toCharArray();
        long shiftSumm = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            shiftSumm += shifts[i];
            val[i] = (char) ((val[i] - 'a' + shiftSumm) % 26 + 'a');
        }

        return new String(val);
    }
}