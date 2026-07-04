class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left++));
                count--;
            }
            set.add(s.charAt(i));
            count++;
            max = Math.max(max,count);
        }
        return max;
    }
}