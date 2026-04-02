class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        Stack<Integer> st = new Stack<>();
        for(int i : ast){
            if(i>0)
                st.push(i);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(i))
                    st.pop();
                else if(st.isEmpty() || st.peek()<0)
                    st.push(i);
            }
        }
        int [] arr = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty()){
            arr[i--]=st.pop();
        }
        return arr;
    }
}