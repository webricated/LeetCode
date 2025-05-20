class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        // Step 1: Copy matrix into answer array
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        // Step 2: Traverse the original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // Mark entire row and column in ans
                    for (int col = 0; col < n; col++) {
                        ans[i][col] = 0;
                    }
                    for (int row = 0; row < m; row++) {
                        ans[row][j] = 0;
                    }
                }
            }
        }

        // Step 3: Copy result back to original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
