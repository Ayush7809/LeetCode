class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> mp = new HashMap<>();
        for(int p : power)
            mp.put(p, mp.getOrDefault(p, 0L)+1);
        
        List<Integer> arr = new ArrayList<>(mp.keySet());
        Collections.sort(arr);

        int n = arr.size();
        long [] dp = new long[n];
        dp[0] = mp.get(arr.get(0))*arr.get(0);

        for(int i=1;i<n;i++){
            long a = mp.get(arr.get(i))*arr.get(i);
            int b = binary(arr, i-1, arr.get(i)-3);
            if(b>=0)
                a+=dp[b];
            dp[i] = Math.max(dp[i-1],a);
        }

        return dp[n-1];
    }

    private int binary(List<Integer> arr, int e, int t){
        int l = 0, r = e, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= t) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }
}