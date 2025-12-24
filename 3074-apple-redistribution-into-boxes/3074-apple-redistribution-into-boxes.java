class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n= apple.length;
        int m = capacity.length;
        int sum=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        int count=0;
        Arrays.sort(capacity);
        for(int i=m-1;i>=0;i--){
            sum2+=capacity[i];
            count++;
            if(sum2>=sum)
                break;
        }
        return count;
    }
}