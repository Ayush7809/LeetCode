class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        int p=0;
        Arrays.sort(nums);
        p = nums[n-1]*nums[n-2]*nums[n-3];
        int pr = nums[0]*nums[1]*nums[n-1];
        return Math.max(p,pr);
    }
}