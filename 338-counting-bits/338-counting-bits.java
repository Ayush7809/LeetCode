class Solution {
    public int[] countBits(int n) {
      
        int [] ar = new int[n+1];
        ar[0]=0;
       for(int i=0;i<=n;i++){
           if(i%2!=0){
             ar[i]=  ar[i/2]+1;
           }
           else{
             ar[i]=  ar[i/2];
           }
       }
        return ar;
    }
}