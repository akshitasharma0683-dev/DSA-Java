public class bianarySearch{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,11,33,35,67,89};
       int target = 35;
       int ans= binarySearchmethod(arr,target);
       System.out.println(ans);
    }
    static int binarySearchmethod(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while(end>=start){
          int  mid= start+( end- start)/2;
          if (target>arr[mid]) {
            start=mid+1;
          }
          if (target<arr[mid]) {
            end=mid-1;
          }
          if(arr[mid]==target){
            return mid;
          }
        }

        return -1;
    }
}