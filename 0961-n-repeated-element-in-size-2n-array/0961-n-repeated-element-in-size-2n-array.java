class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        //int a = nums[0];
        Arrays.sort(nums);
        for(int i =0;i<n-1;i++){
            if((nums[i]^nums[i+1])==0)
                return nums[i];
        }
        return -1;
    }
}