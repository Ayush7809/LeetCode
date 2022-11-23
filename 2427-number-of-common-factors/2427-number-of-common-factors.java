class Solution {
    public int commonFactors(int a, int b) {
        int n = Math.max(a,b);
        int count=0;
        int i=1;
        for( i=1;i<=n;i++){
            if(a%i==0 && b%i==0)
                count++;
            
        }
          //System.out.print(i);
        return count;
    }
}