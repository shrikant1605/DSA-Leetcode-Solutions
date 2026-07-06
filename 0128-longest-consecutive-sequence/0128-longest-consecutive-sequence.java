class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int sum = 1;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                sum++;
            }else{
                max =Math.max(sum,max);
                sum = 1;
            }

        }

        return Math.max(sum,max);
    }
}