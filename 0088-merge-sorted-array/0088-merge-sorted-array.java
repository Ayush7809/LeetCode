class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,k=nums1.length-1;
        for(i=m-1,j=n-1; i>=0 && j>=0;)
        {
        if(nums1[i]>=nums2[j])
        {
        nums1[k--]=nums1[i--];
        }
        else if(nums1[i]<nums2[j])
        {
        nums1[k--]=nums2[j--];
        }
        }
        while(j>=0 && i<0)
        {
        nums1[k--]=nums2[j--];
        }
    }
}