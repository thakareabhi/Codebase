class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] arrlt=new int[n];
        int[] arrrt=new int[n];
        arrlt[0]=1;
        arrrt[n-1]=1;

        for (int i=1;i<n;i++){
            arrlt[i]=arrlt[i-1]*nums[i-1];
        }
        for(int i=n-1;i>0;i--){
            arrrt[i-1]=arrrt[i]*nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=arrrt[i]*arrlt[i];
        }
        
        return nums;
    }