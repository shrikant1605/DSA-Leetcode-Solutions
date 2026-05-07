// Leetcode 283: Move Zeros
//Approach: Two Pointers
// Time Complexity: O(n)
//Space Complexity: O(1)

//Solution:

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        for(int j=i;j<nums.length;j++)
            nums[j]=0;
    }
}