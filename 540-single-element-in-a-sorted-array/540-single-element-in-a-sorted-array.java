class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int m = 0;
        for(int i = 0;i<n;i++){
            if(m<nums[i]){
                m = nums[i];
            }
        }
        int ar[] = new int[m+1];
        for(int i = 0;i<n;i++){
            ar[nums[i]]++;
        }
        for(int i= 0;i<m+1;i++){
            if(ar[i]==1){
                return i;
            }
        }
        return -1;
        
    }
}