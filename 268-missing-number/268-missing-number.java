class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sum1=0;
        int diff =0;
        int n= nums.length;
       for(int i=0;i<n;i++){
           sum= (n*(n+1))/2;
          
       }
        for(int j=0;j<n;j++){
           sum1= sum1+nums[j];
           
        }
        diff = sum-sum1;
        return diff;
    }
}