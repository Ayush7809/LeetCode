class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Long> st = new Stack<>();
        long ans =0, num=0, sign =1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                num=num*10+(c-'0');
            else if(c == '+'){
                ans +=num*sign;
                num=0;
                sign = 1;
            }
            else if(c=='-'){
                ans+=num*sign;
                num=0;
                sign=-1;
            }
            else if(c == '('){
                st.push(ans);
                st.push(sign);
                ans =0;
                sign =1;
            }
            else if(c==')'){
                ans+=num*sign;
                num =0;
                long prevsign = st.pop();
                long prevans = st.pop();
                ans = prevans + prevsign*ans;
            }
        }
        ans+=sign*num;
        return (int)ans;

    }
}