class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int finalLeft = -1;
        int finalRight = -1;
        while(left<nums.length && right>=0){
            if(nums[left]==target){
                if(finalLeft==-1)finalLeft = left;
            }
            if(nums[right]==target){
                if(finalRight==-1)finalRight = right;
            }
            left++;
            right--;
        }
        return new int[]{finalLeft,finalRight};
    }
}