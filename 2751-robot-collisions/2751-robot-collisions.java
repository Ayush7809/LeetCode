class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer [] arr = new Integer[n];
        List<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            arr[i] = i;
        }
        
        Arrays.sort(arr, (lhs, rhs) ->Integer.compare(positions[lhs],positions[rhs]));
        
        for(int i:arr){
            // Add right-moving robots to the stack
            if(directions.charAt(i)=='R'){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && healths[i]>0){
                    //Pop the top robot from the stack for collision check
                    int top = st.pop();
                    // Top robot survives, current robot is destroyed
                    if(healths[top]>healths[i]){
                        healths[top]-=1;
                        healths[i] =0;
                        st.push(top);
                    }
                    else if(healths[top]<healths[i]){
                        healths[i]-=1;
                        healths[top] =0;
                    }
                    else{
                        healths[i] =0;
                        healths[top] = 0;
                    }
                }
            }
        }
        for(int i=0;i<n;++i){
            if(healths[i]>0){
                li.add(healths[i]);
            }
        }
        return li;
    }
}