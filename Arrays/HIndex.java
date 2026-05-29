public class HIndex {
    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        int ans= hIndex(arr);
        System.out.println(ans);
    }
    static int hIndex(int [] arr){
        int n=arr.length;
        int start=0;
        int end = n-1;

        while (start<=end) {
            int mid= start+(end-start)/2;

            if (arr[mid] < n-mid) {
                start=mid+1;
            }else {
                end = mid-1;
            }
             if (arr[mid] == n-mid) {
                return n-mid;
            }                                  
        }
        return n-start;

    }
}
