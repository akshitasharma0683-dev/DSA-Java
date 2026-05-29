public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,14,16,18,45,78};
        int ans= floor(arr,10);
        System.out.println(ans);
    }
    static int floor(int [] arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end) {
            int mid= start+(end-start)/2;

            if (target>arr[mid]) {
                start=mid+1;
            }else {
                end = mid-1;
            }
             if (target==arr[mid]) {
                return arr[mid];
            }
        }
        return arr[end];

    }
}
