class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans =0,si=0,ei=0,p=1;
		while(ei<arr.length) {
			//grow
			p*=arr[ei];
			//shrink
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			ans = ans+(ei-si+1);
			ei++;
		}
		return ans;
	
    }
}