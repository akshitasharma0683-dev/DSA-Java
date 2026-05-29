public class PeakIndex {
    public static void main(String[] args) {
       int[] arr ={0,1,0};
       int ans=peakIndexInMountainArray(arr);
       System.out.println(ans);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }else if(arr[mid+1]<arr[mid]){
                end=mid;
            }
        }
        return end;
    }
    
}
