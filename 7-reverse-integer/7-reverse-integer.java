class Solution {
    public int reverse(int x) {
        long s=0;
        long s1=0;
        if(x<0){
            x = -1*x;
            
             while(x>0){
            int rem = x%10;
            s1=s1*10+rem;
            x=x/10;
         
                 
        }
            s1 = -1*(s1);
            if(s1<-2147483648){
                return 0;
            }
            return (int)s1 ;

        }
        else{
            while(x>0){
                int rem = x%10;
                s=s*10+rem;
                 x=x/10;
            }
        }
        if(s>2147483647){
            return 0;
        }

        return (int)s;
    }
}