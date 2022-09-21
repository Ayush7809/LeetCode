class Solution {
    public int numIdenticalPairs(int[] nums) {
       /* int m=0;
        //int c=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                else{
                    continue;
                }
               // System.out.print(c);
                m= m + (c*(c-1)/2);
            
            }
        }
        return m;*/
        int m = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]>m){
                m = nums[i];
            }
        }
        int ar[] = new int[m+1];
        for(int i = 0;i<n;i++){
            ar[nums[i]]++;
        }
        int s = 0;
        for(int i = 0;i<m+1;i++){
            int c = ar[i];
            s = s + ((c)*(c-1))/2;
        }
        return s;
    }
}