public class MaxIn2D {
    public static void main(String[] args) {
        int arr[][]= {{2,3,4},{23,56,68},{65,8,-4}};
        int ans = max( arr);
        System.out.println(ans);
    }
    static int max(int[][]arr){
        if (arr.length==0) {
            return -1;
        }

        int max= arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max<arr[row][col]) {
                    max=arr[row][col];
                }

            }
            
        }
                        return max;

  


    }

}
