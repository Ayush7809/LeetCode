class Solution {
    public boolean predictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length-1)>=0;
    }
    public static int winner(int [] nums, int i, int j){
        int n = nums.length;
        if(i==j)
            return nums[i];
        int left = nums[i] - winner(nums, i+1,j);
        int right = nums[j] - winner(nums, i, j-1);
        return Math.max(left, right);
    }
}