class Solution {
    public int findGCD(int[] nums) {
        int  n = nums.length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<max)
                max = nums[i];
           // System.out.println(max);
            if(nums[i]>min)
                min = nums[i];
            //System.out.println(min);
        }
        return gcd(max,min);
    }
    public int gcd(int max, int min){
        if(min==0)
            return max;
        return gcd(min,max%min);
    }
}