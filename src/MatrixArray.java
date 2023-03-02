import java.util.Arrays;

public class MatrixArray {
    public static void main(String[] args){
        int[][] matrix = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        int target = 91;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        for(int row = 0; row <= matrix.length-1; row++){
            for(int col = 0; col <= matrix.length-1; col++){
                if(matrix[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
