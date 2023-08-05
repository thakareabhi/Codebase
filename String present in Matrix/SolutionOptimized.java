class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    if( checkeFunction(board,word,i,j,1)){
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public boolean checkeFunction(char[][] board, String word, int i,int j,int schar){

        char originalChar = board[i][j];
        board[i][j]='-';

        if(schar==word.length()){
            return true;
        }
        boolean returnflag=false;
        if(i-1>-1){
            //LT
            if(board[i-1][j]==word.charAt(schar)){
                if(schar==word.length()-1){
                    return true;
                }
                if(checkeFunction( board,word,i-1,j,schar+1)){
                    return true;
                }
            }
        }

        if(i+1<board.length){
            //RT
            if(board[i+1][j]==word.charAt(schar)){
                if(schar==word.length()-1){
                    return true;
                }
                if(checkeFunction( board,word,i+1,j,schar+1)){
                    return true;
                }
            }
        }

        if(j-1>-1){
            //BT
            if(board[i][j-1]==word.charAt(schar)){
                if(schar==word.length()-1){
                    return true;
                }
                if(checkeFunction( board,word,i,j-1,schar+1)){
                    return true;
                }
            }
        }

        if(j+1<board[0].length){
            //UT
            if(board[i][j+1]==word.charAt(schar)){
                if(schar==word.length()-1){
                    return true;
                }
                if(checkeFunction( board,word,i,j+1,schar+1)){
                    return true;
                }
            }
        }

        board[i][j]=originalChar;
        return false;
    }
}