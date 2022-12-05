class Solution {
    public boolean isPowerOfThree(int n){
        // time limit exceed
       /* for(int i=0;i<n;i++){
            if(n==Math.pow(3,i))
                return true;
        }
        return false;*/
        
        /* if(n==0) 
            return false;
        while(n!=1){
            int r=n%3;
            n=n/3;
            if(r!=0)
                return false;
        }
        return true;*/
        long x =1;
        while(x<n){
            x= x*3;
        }
        return x==n;
    }
}