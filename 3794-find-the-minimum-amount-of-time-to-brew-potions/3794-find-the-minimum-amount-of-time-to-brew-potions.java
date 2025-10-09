class Solution {
    public long minTime(int[] skill, int[] mana) {
       int n = skill.length, m = mana.length;
       long [] dp = new long[n+1];

        for(int j=0;j<m;++j){
            for(int i=0;i<n;++i){
                dp[i+1] = Math.max(dp[i+1],dp[i])+(long)mana[j]*skill[i];
            }
            for(int i=n-1;i>0;--i){
                dp[i] = dp[i+1] - (long) mana[j] * skill[i];
            }
        }
        return dp[n];
    }
}