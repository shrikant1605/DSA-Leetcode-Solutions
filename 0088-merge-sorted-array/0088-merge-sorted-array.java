class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m+n];
        int idx = 0;
        int i=0;
        int j =0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j])result[idx++] = nums1[i++];
            else result[idx++] = nums2[j++];
        }

        while(i<m){
            result[idx++] = nums1[i++];
        }
        while(j<n){
            result[idx++] = nums2[j++];
        }
        for(int k=0;k<nums1.length;k++){
            nums1[k] = result[k];
        }
    }
}