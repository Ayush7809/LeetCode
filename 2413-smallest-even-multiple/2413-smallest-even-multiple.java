class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0){
            n=n*2;
            if(n%2==0){
                return n;
            }
        }
        return n;
    }
}