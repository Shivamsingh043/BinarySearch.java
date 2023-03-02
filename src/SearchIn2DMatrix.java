import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {20, 30, 34, 60}
        };
        int target = 3;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[] {row, col};
            }
            else if (matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
