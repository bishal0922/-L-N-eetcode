//Neetcode -> Array & Hashing

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //unique 1-9 distinct
        //every row has to be unique
        //every column has to be unique
        //every 3x3 box has to be unique
        
        //creating a HashSet
        Set set = new HashSet();
        
        //to iterate through all rows
        for (int i=0; i < 9; i++){
            //to iterate through all columns in a row
            for (int j=0; j < 9; j++){
                //select element from 9x9 array
                char c = board[i][j];
                if (c != '.'){
                //if the set isn't able to add the char info - suggesting that it already exists we return false
                if (!set.add("row"+i+"has"+c) ||
                    !set.add("column"+j+"has"+c)||
                    !set.add("box"+i/3+"-"+j/3+"has"+c)){
                    return false;
                }
                }
            }
        }
        
        //we are able to add all the non '.' characters to our set
        return true;
    }
}
