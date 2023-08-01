class Solution {
    public int search(int[] nums, int target) {

        if(target==nums[0]){
            return 0;
        }
        if(target==nums[nums.length-1]){
            return nums.length-1;
        }

        if(target>nums[0]){
            //direct Traverse
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==target){
                    return i;
                }
                if(nums[i]>nums[i+1]){
                    return -1;
                }
            }
        }else {
            for(int i=nums.length-1;i>0;i--){
                if(nums[i]==target){
                    return i;
                }
                if(nums[i]<nums[i-1]){
                    return -1;
                }
            }
        }
        return -1;
    }


}