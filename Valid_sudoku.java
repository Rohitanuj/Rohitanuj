
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (seen.contains(number + "_Row_" + i) ||
                            seen.contains(number + "_Col_ " + j) ||
                            seen.contains(number + "_Box_" + i/3 + "_" + j/3)) {

                        return false;
                    } else {
                        seen.add(number + "_Row_" + i);
                        seen.add(number + "_Col_ " + j);
                        seen.add(number + "_Box_" + i/3 + "_" + j/3);
                    }

            }
        }
        return true;
    }
}
