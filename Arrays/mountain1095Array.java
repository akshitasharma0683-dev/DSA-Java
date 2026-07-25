public class mountain1095Array {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,4,3,1};
       int  target =4;
       int ans=search(arr,target);
       System.out.println(ans);

    }
    static int search(int[] arr, int target){
        int peak= peak(arr);

        int ans= orderignostic(arr, target, 0, peak);
        if(ans==-1){
     ans= orderignostic(arr, target, peak+1, arr.length-1);

        }
        return ans;
    }

    static int peak(int[] arr){
        int start=0;
        int end = arr.length-1;
         while(start<end){
            int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
          end=mid;
        }else{
          start=mid+1;
        }
         }
         return end;

    }

    static int orderignostic(int []arr, int target,int start,int end){
        if (start<end) {
             
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
        } else {
            
        while(end>=start){
          int  mid= start+( end- start)/2;
          if (target<arr[mid]) {
            start=mid+1;
          }
          if (target>arr[mid]) {
            end=mid-1;
          }
          if(arr[mid]==target){
            return mid;
          }
        }
        }
        return -1;
}
}