class Solution {
    public void merge(int[] arr, int n, int[] arr1, int m) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // int i=0, j=0;
        // while(i<m && j<n){
        //     if(nums1[i]<nums2[j]){
        //         arr.add(nums1[i]);
        //         i++;
        //     }
        //     else{
        //         arr.add(nums2[j]);
        //         j++;
        //     }
        // }
        // while(i<m){
        //     arr.add(nums1[i]);
        //     i++;
        // }
        // while(j<n){
        //     arr.add(nums2[j]);
        //     j++;
        // }
        // for(i=0;i<arr.size();i++){
        //     nums1[i] = arr.get(i);
        // }


        // for(int j=0,i=m;j<n;j++){
        //     nums1[i] = nums2[j];
        //     i++;
        // }
        // Arrays.sort(nums1);

        
        ArrayList<Integer> arr2 = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(arr[i]<arr1[j]){
                arr2.add(arr[i++]);
                
            }
            else{
                arr2.add(arr1[j++]);
            }
        }
        while(i<n){
            arr2.add(arr[i++]);
        }
        while(j<m){
            arr2.add(arr1[j++]);
        }
        for(i=0;i<arr2.size();i++){
            arr[i] = arr2.get(i);
         }
    }
}