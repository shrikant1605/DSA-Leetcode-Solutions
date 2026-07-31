class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i:prices){
            if(i<min){
                min = i;
                continue;
            }
            max = Math.max(max, i-min);
        }
        return max;
    }
}