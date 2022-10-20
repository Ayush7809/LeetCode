class Solution {
    public int findKthLargest(int[] nums, int k) {
        // firstly sort the array and then length - k se  pichhe se maximum value millegi 
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}