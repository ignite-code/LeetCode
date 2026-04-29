class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int n = s.length();

        int cycle = 2 * numRows - 2;
        int cols = (n / cycle + 1) * (numRows - 1);

        char[][] matrix = new char[numRows][cols];

        int row = 0, col = 0;
        int index = 0;

        while (index < n) {

            while (row < numRows && index < n) {
                matrix[row][col] = s.charAt(index++);
                row++;
            }

            row = numRows - 2;
            col++;

            while (row > 0 && index < n) {
                matrix[row][col] = s.charAt(index++);
                row--;
                col++;
            }

            row = 0;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != '\0') {
                    result.append(matrix[i][j]);
                }
            }
        }

        return result.toString();
    }
}