public class orderAgnostic{
public static void main(String[] args) {
    int[] arr = {2,4,6,8,11,33,35,67,89};
       int target = 6;
       int ans= Oabs(arr,target);
       System.out.println(ans);

}
    static int Oabs(int[]arr, int target){
        int start=0;
        int end= arr.length-1;

        boolean isAscending = arr[end] > arr[start] ;
            while(end>=start){
       int mid= start +( end - start)/2;

       if (arr[mid]==target) {
        return mid;
       }

        if (isAscending) {
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
       }else{
         if(target<arr[mid]){
                start = mid+1;
            }
           else if(target>arr[mid]){
                end = mid-1;
            }
       }
       
    }
    return -1;
}
}