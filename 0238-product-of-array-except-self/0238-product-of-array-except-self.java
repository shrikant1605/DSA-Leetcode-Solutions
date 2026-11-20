class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftSide[] = new int[nums.length];
        leftSide[0]=1;
        for(int i=1;i<nums.length;i++){
            leftSide[i] = leftSide[i-1]*nums[i-1];
        }
        int rightSide[] = new int[nums.length];
        rightSide[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightSide[i] = rightSide[i+1]*nums[i+1];
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = leftSide[i]*rightSide[i];
        }
        return result;
    }
}