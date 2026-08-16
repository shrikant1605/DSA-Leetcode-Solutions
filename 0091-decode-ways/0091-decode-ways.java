class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                dp[i+1]+=dp[i];
            }
            if(i>0){
                String lastTwo = s.substring(i-1,i+1);
                if(Integer.parseInt(lastTwo)>=10 && Integer.parseInt(lastTwo)<27)
                    dp[i+1] += dp[i-1];
            }
        }
        return dp[s.length()];
    }
}