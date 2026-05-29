class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.min(ans, sum(nums[i]));
        }
        return ans;
    }
    public static int sum(int n ){
        int sum =0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}