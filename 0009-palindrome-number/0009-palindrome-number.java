class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n = 0;
        int original = x;
        while(x!=0){
            n*=10;
            n+=x%10;
            x/=10;
        }
        if(n==original)return true;
        return false;
    }
}