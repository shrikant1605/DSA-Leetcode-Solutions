//Leetcode 121: Best time to buy and sell stock
//Approach: Greedy
//Time Complexity: O(n)
//Space Complexity: O(1)


//Solution:
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i:prices){
            if(i<min)min = i;
            else max = Math.max(max, i-min);
        }
        return max;
    }
}