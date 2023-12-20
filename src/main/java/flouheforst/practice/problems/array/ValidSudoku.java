package flouheforst.practice.problems.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    private final int BLOCK_SIZE = 3;
    
    public boolean solution(char[][] board) {
        final boolean isValidBlocks = this.checkBlocks(board);
        final boolean isValidRows = this.checkRows(board);
        final boolean isValidColumns = this.checkColumns(board);
        
        if (!isValidBlocks)
            return false;
        if (!isValidRows)
            return false;
        return isValidColumns;
    }
    
    private boolean checkBlocks(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Integer> s = new HashSet();
                for (int k = 0; k < 3; k++) {
                    for (int q = 0; q < 3; q++) {
                        if (board[k + (i * BLOCK_SIZE)][q + (j * BLOCK_SIZE)] != '.') {
                            Integer item = Integer.parseInt(String.valueOf(board[k + (i * BLOCK_SIZE)][q + (j * BLOCK_SIZE)]));
                            
                            if (s.contains(item)) {
                                return false;
                            }
                            
                            s.add(item);
                        }
                    }
                }
                
            }
        }
        
        return true;
    }
    
    public boolean checkRows(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            Set<Integer> s = new HashSet();
            
            for (int k = 0; k < 9; k++) {
                if (board[i][k] != '.') {
                    Integer item = Integer.parseInt(String.valueOf(board[i][k]));
                    
                    if (s.contains(item)) {
                        return false;
                    }
                    
                    s.add(item);
                }
            }
        }
        
        return true;
    }
    
    public boolean checkColumns(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> s = new HashSet();
            
            for (int k = 0; k < 9; k++) {
                if (board[k][i] != '.') {
                    
                    Integer item = Integer.parseInt(String.valueOf(board[k][i]));
                    
                    if (s.contains(item)) {
                        return false;
                    }
                    
                    s.add(item);
                }
            }
        }
        
        return true;
    }
}