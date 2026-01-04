class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int n : nums){
            int count =0, sum =0;
            // agar perfect sq. hua to count me 1 add hoga nhi to 2 value add hongi d1 & d2
            for(int i=1; i*i<=n;i++){
                if(n%i==0){
                    int d1 = i;
                    int d2 = n/i;
                    // perfect square hoga to d1==d2 hoga
                    if(d1==d2){
                        count++;
                        sum+=d1;
                    }
                    else{
                        count+=2;
                        sum+=d1+d2;
                    }
                    if(count>4)
                        break;
                } 
            }
            if(count==4){
                ans+=sum;
            }
        }
        return ans;
    }
}