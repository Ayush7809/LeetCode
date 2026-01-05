class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = matrix[i][j];
                sum += Math.abs(val);

                if (val < 0) count++;

                min = Math.min(min, Math.abs(val)); // ✅ FIX
            }
        }

        if (count % 2 == 0) return sum;

        return sum - 2L * min;
    }
}
