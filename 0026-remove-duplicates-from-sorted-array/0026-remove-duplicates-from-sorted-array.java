class Solution {
    public int removeDuplicates(int[] nums) {
         int n = nums.length;
        int[] arr = new int[n];
        int m = Integer.MIN_VALUE;
        int  jdx = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] >m){
                m = nums[i];
                arr[jdx] = m;
                jdx++;
            }   
        }
        for(int i = 0; i< arr.length; i++)
            nums[i] = arr[i];
        
        return jdx ;
    }
}