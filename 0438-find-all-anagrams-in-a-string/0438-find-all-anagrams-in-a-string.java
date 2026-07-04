class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) return new ArrayList<>();
        
        int freqP[] = new int[26];
        int freqWindow[] = new int[26];
        
        for(int i = 0; i < p.length(); i++){
            freqP[p.charAt(i) - 'a']++;
            freqWindow[s.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(freqP, freqWindow)) list.add(0);
        
        for(int i = p.length(); i < s.length(); i++){
            freqWindow[s.charAt(i) - 'a']++;
            freqWindow[s.charAt(i - p.length()) - 'a']--;
            
            if(Arrays.equals(freqP, freqWindow)){
                list.add(i - p.length() + 1);
            }
        }
        
        return list;
    }
}