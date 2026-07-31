class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int len = 0;
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];
            len++;
            while(sum>=target){
                min = Math.min(min,len);
                sum-=nums[left++];
                len--;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}