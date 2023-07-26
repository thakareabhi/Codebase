class Solution {
    public int[] twoSum(int[] nums, int target) {

     Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }


                for(int i=0;i<nums.length;i++){
                    int find=target-nums[i];
                    if(map.containsKey(find) && map.get(find)!=i){
                        return new int[] {i,map.get(find)};
                    }
                }

                return null;

    }
}