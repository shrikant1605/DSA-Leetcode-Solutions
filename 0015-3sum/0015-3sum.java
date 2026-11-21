class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(-(curr+nums[j]))){
                    List<Integer> list = Arrays.asList(curr,nums[j],-(curr+nums[j]));
                    Collections.sort(list);
                    set.add(list);
                }
            }
            map.put(nums[i],i);
        }
        return new ArrayList<>(set);
    }
}