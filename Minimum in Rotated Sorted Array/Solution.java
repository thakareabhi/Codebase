class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int arrmax=nums[0];


        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arrmax=Integer.max(sum,arrmax);
            if(sum<0){
                sum=0;
            }
        }
        return arrmax;

    }
}