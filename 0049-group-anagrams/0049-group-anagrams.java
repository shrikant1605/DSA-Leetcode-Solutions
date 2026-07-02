class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String newString = new String (ch);
            if(!map.containsKey(newString)){
                map.put(newString,new ArrayList<>());
            }
            map.get(newString).add(str);
        }
        return new ArrayList<>(map.values());
    }

}