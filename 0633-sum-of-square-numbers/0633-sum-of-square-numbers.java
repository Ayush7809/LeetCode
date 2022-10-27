class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j= (int)(Math.sqrt(c));
        while(i<=j){
            long s = i*i +j*j;
            if(s==c)
                return true;
            else if(s>c)
                j--;
            else
                i++;
        }
        return false;
    }
}