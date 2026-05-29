import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int [] arr = {2,35,7,8,5,32};
        System.out.println(Arrays.toString(arr));
        System.out.println( max1(arr));
    }
    static int max1(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}
