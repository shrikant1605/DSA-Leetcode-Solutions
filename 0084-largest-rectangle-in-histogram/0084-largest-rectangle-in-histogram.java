class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int h[] = new int[heights.length+1];
        System.arraycopy(heights,0,h,0,heights.length);
        h[heights.length] = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<h.length;i++){
            while(!stack.isEmpty() && h[stack.peek()]>h[i]){
                int w = h[stack.pop()];
                int he = stack.isEmpty()? i : i-stack.peek()-1;
                max = Math.max(max,he*w);
            }
            stack.push(i);
        }
        return max;
    }
}