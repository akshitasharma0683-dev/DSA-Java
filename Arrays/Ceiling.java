public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,11,33,35,67,89};
       int target = 12;
       int ans= ceiling1(arr,target);
       System.out.println(ans);

    }
    static int ceiling1(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end) {
            int mid= start +( end -start )/2; 
            
            if (target==arr[mid]) {
                return arr[mid];
            }
             if (target>arr[mid]) {
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];
    }

    }

