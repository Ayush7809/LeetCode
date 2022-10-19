class Solution {
    public int removeDuplicates(int[] nums) {
        //Use as a frequency element 
         int n = nums.length;
        int[] arr = new int[n];
        int m = Integer.MIN_VALUE;
        int  j = 0;//Index of next array 
        for(int i = 0; i < n; i++){
            if(nums[i] >m){
                m = nums[i];
                arr[j] = m;
                j++;
            }   
        }
        for(int i = 0; i< arr.length; i++)
            nums[i] = arr[i];
        
        return j ;
    }
}