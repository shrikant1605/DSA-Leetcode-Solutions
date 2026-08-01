class Solution {
    int start = 0;
    int len = 0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            expand(i,i,s);
            expand(i,i+1,s);
        }
        return s.substring(start,start+len);
    }
    private void expand(int left, int right, String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        if(len<(right-left-1)){
            start = left+1;
            len = right-left-1;
        }
    }
}