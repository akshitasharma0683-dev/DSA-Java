public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int target = 5;
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
