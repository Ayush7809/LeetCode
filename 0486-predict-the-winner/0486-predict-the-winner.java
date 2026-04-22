class Solution {
    public boolean predictTheWinner(int[] nums) {
        int [][] dp = new int[nums.length][nums.length];
        for(int [] a : dp){
            Arrays.fill(a, -1);
        }
        return winner(nums, 0, nums.length-1, dp)>=0;
    }
    public static int winner(int [] nums, int i, int j, int [][] dp){
        int n = nums.length;
        if(i==j)
            return nums[i];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int left = nums[i] - winner(nums, i+1,j,dp);
        int right = nums[j] - winner(nums, i, j-1,dp);
        return dp[i][j] = Math.max(left, right);
    }
}