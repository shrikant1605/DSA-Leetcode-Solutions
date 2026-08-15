class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:nums){
            sum+=i;
            if(i>=sum){
                sum = i;
            }
            max = Math.max(sum,max);
        }
        return Math.max(sum,max);
    }
}