class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int end = s.length()-1;
        while(s.charAt(end)==' ')end--;
        for(int i=end;i>=0;i--){
            if(s.charAt(i)==' ')return count;
            count++;

        }
        return count;
    }
}