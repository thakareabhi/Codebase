class Solution {
    public int[] twoSum(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if((nums[i]+nums[j])==target && i!=j){
                    int[] finalInt=new int[2];
                    finalInt[0]=i;
                    finalInt[1]=j;
                    return finalInt;
               }
           }
       }
       return null;
    }
}