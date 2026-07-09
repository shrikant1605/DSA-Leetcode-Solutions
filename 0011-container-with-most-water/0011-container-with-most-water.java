class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int bheight = Math.min(height[left],height[right]);
            int width = right-left;
            max = Math.max(max,bheight*width);
            if(height[left]<height[right]){
                left++;
            } 
            else right--;
        }
        return max;
    }
}