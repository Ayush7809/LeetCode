class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        int n = height.length;
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[st.peek()] < height[i]) {
                int m = st.pop(); // Index of the bar at the top of the stack
                if (st.isEmpty()) {
                    break; // No left boundary to trap water
                }
                
                int leftBoundary = st.peek(); // Index of the left boundary
                int minHeight = Math.min(height[leftBoundary], height[i]) - height[m];
                int width = i - leftBoundary - 1;
                sum += minHeight * width;
            }
            st.push(i);
        }
        
        return sum;
    }
}