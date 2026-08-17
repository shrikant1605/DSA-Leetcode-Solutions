class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        return Math.max(robRange(nums,0,nums.length-2),robRange(nums,1,nums.length-1));
    }
    int robRange(int nums[], int start,int end){
        if(start==end)return nums[start];
        int dp[] = new int[end-start+1];
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0],nums[start+1]);
        for(int i=2,j=start+2;j<=end;j++,i++){
            dp[i] = Math.max(nums[j]+dp[i-2],dp[i-1]);
        }
        return dp[end-start];
    }
}