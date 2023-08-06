class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowt=matrix[0].length;
        int colt=matrix.length;

        List<Integer> lst=new ArrayList<>();;
        int t=Math.min((colt+1)/2,(rowt+1)/2);
        for(int i=0;i<t;i++){


            //Top Row
            for(int j=i;j<rowt-i;j++){
                if(matrix[i][j]!=Integer.MAX_VALUE){
                    lst.add(matrix[i][j]);
                    matrix[i][j]=Integer.MAX_VALUE;
                }
            }

            //Rt Col
            for(int j=i+1;j<colt-i-1;j++){
                if(matrix[j][rowt-i-1]!=Integer.MAX_VALUE){
                    lst.add(matrix[j][rowt-i-1]);
                    matrix[j][rowt-i-1]=Integer.MAX_VALUE;
                }
            }

            // Btm Row
            for(int j=rowt-i-1;j>i-1;j--){
                if(matrix[colt-i-1][j]!=Integer.MAX_VALUE){
                    lst.add(matrix[colt-i-1][j]);
                    matrix[colt-i-1][j]=Integer.MAX_VALUE;
                }
            }
            //Lt Col
            for(int j=colt-i-2;j>i;j--){
                if(matrix[j][i]!=Integer.MAX_VALUE){
                    lst.add(matrix[j][i]);
                    matrix[j][i]=Integer.MAX_VALUE;
                }
            }
        }
        return  lst;
    }
}