public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {---------------------------------------------------------------------------------------,4,5,6,7,8,12,14,15,17,22,33,44,55,66,77,88,99,110,111,123,145};
        int target= 123;
        System.out.println(range(arr,target));
    }
        static int range(int[]arr, int target){
            int start = 0;
            int end = 1;

            while(target>arr[end]){
                int temp= end+1;
                 end = end + (end-start+1) * 2;
                 start = temp;

                 if (end >= arr.length) {
                end = arr.length - 1;
            }

            }
           return (search(arr,target,start,end));
        }
    static int search(int[]arr , int target,int start,int end){
       
        while(start<=end){
            int mid = start+(end-start)/2;

                      if (target > arr[mid]) {

                start = mid + 1;

            } else if (target < arr[mid]) {

                end = mid - 1;

            } else {

                return mid;

        }
    }
            return -1;

}
}
