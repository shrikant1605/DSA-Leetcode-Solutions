//Leetcode 3: Longest Substring without repeating character
//Approach: Sliding Window
//Time complexity: O(n)
//Space complexity: O(n)

//Solution:
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        int count = 0;
        char cha[] = s.toCharArray();
        for(int right=0;right<cha.length;right++){
            while(set.contains(cha[right])){
                count--;
                set.remove(cha[left++]);   
            }
            if(!set.contains(cha[right])){
                set.add(cha[right]);
                count++;
                max = Math.max(max,count);
            }
            
        }
        return max;
    }
}