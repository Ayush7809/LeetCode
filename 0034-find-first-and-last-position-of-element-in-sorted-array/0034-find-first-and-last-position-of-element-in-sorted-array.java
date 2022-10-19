class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int arr[]=new int[2];
        int start=-1;
        int end=-1;
        int j=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                start=i;
                break;
            }
        }
        for(j=n-1;j>=0;j--){
            if(nums[j]==target){
                end=j;
                break;
            }
        }
        arr[0]=start;
        arr[1]=end;
        return arr;
        
    }
}