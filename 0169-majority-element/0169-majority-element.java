class Solution {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        int m=0;
        int count=0;
        Arrays.sort(nums);
        // frequency 
        int l=n/2;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
               count++;
                if(count>=l){
                    return nums[i];
                 }
            }
            else{
                count =0;
            }
        }
        
        
        return -1;
    }
}