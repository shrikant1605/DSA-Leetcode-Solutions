class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>sum && sum!=Integer.MIN_VALUE){
                sum = Math.max(sum+nums[i],nums[i]);
            }
            else if(sum==Integer.MIN_VALUE)sum = nums[i];
            else{
                sum+=nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}