class Solution {
    public int maxArea(int[] height) {
        int areaMax=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            int bth=j-i;
            int tempArea=0;
            if(height[i]>height[j]){
                tempArea=height[j]*bth;
                if(tempArea>areaMax){
                    areaMax=tempArea;
                }
                j--;
            }else{
                tempArea=height[i]*bth;
                if(tempArea>areaMax){
                    areaMax=tempArea;
                }
                i++;
            }
        }

        return areaMax;
    }

}