class Solution {
    public boolean isValidSudoku(char[][] board) {
       // Create 9 sets for rows, columns, and 3x3 boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize each set
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                // Skip empty cells
                if (current == '.') continue;

                // Calculate box index
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if current number is already in the row, column or box
                if (rows[i].contains(current) || 
                    cols[j].contains(current) || 
                    boxes[boxIndex].contains(current)) {
                    return false;
                }

                // Add current number to row, column, and box sets
                rows[i].add(current);
                cols[j].add(current);
                boxes[boxIndex].add(current);
            }
        }

        return true; 

    }
}