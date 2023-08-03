class Solution {
    public void setZeroes(int[][] matrix) {

        HashSet<Integer> rowno=new HashSet<Integer>();
        HashSet<Integer> colno=new HashSet<Integer>();

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowno.add(i);
                    colno.add(j);
                }

            }
        }


        for (Integer ele : rowno) {
            for(int j=0;j<matrix[0].length;j++){
                matrix[ele][j]=0;
            }
        }


        for(Integer ele : colno){
            for(int j=0;j<matrix.length;j++){
                matrix[j][ele]=0;
            }
        }


    }
}