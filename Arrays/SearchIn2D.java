import java.util.Arrays;

public class SearchIn2D{
    public static void main(String[] args) {
        int[][] arr = {{1,4,6},
                    {64,65,23},
                    {1},
                    {35,56}
                    };

        int target = 56;
        int [] ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][]arr, int target){
        if (arr.length==0) {
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int c = 0; c < arr[row].length; c++) {
                if (target==arr[row][c]) {
                    return new int[]{row,c};
                }
            }
        }
                    return new int[]{-1,-1};

    }
}