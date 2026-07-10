class Solution {
    public int trap(int[] height) {
        int left = 0;
        int total = 0;
        int leftMax = 0;
        int rightMax = 0;
        int right = height.length-1;
        while(left<right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(height[left]<height[right]){
                total += leftMax-height[left++];
            }
            else total+= rightMax-height[right--];
        }
        return total;
    }
}