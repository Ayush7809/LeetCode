class Solution {
    public boolean isHappy(int n) {
       int sum=0;
        ArrayList<Integer> ar = new ArrayList<>();
        while(sum!=1){
            sum=0;
            while(n!=0){
            
                int rem = n%10;
                sum+= rem*rem;
                n=n/10;
            }
         if(ar.contains(sum)){
                return false;
            }
            ar.add(sum);
            n=sum;
           // System.out.print(sum);
           
        }
        
        return true;
    }
}