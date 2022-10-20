class Solution {
    public int findMin(int[] nums) {
        int m = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<m){
                m = nums[i];
            }
        }
        return m;
    }
}