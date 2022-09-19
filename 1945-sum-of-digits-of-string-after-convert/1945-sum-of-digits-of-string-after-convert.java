class Solution {
    public int getLucky(String s, int k) {
        int l=s.length();
        int sum=0;
        for(int i=0;i<l;i++){
            int v= s.charAt(i)-96;
            while(v>0){
                int rem = v%10;
                sum+=rem;
                v=v/10;
            }
        }
        //System.out.println(sum);
        while(k-->1){
            int r=0;
            while(sum>0){
                int rem = sum%10;
                r+=rem;
                sum=sum/10;
            }
            sum=r;
        }
        return sum;
    }
}