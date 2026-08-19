class Solution {
    int max = 0;
    int start = 0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return s.substring(start,start+max);
        
    }
    void helper(String s,int first,int second){
        while(first>=0 && second<s.length() && s.charAt(first)==s.charAt(second)){
            first--;
            second++;
        }
        
        if(second-first-1>max){
            max = second-first-1;
            start = first+1;
        }
    }

}