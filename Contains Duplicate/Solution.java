class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
                return true;
            }else{
                arr.add(nums[i]);
            }
        }
        return false;
    }
}