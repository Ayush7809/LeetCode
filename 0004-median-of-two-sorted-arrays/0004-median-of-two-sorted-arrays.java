class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int p = m+n;
        int [] arr = new int[p];
        for(int i=0;i<n;i++){
            arr[i] = nums1[i];
        }
        for(int i =0;i<m;i++){
            arr[i+n] = nums2[i];
        }
        Arrays.sort(arr);
        int l = arr.length;
        if(l%2==0)
            return (double)(arr[l/2-1]+arr[l/2])/2;
        else
            return (double)arr[l/2];
    }
}