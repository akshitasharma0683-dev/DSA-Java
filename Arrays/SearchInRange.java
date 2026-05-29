public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={18,12,-7,3,14,28,9};
        int target = 3;
        int ans= searchInRange(arr,target,1,4);
        System.out.println(ans);

    }
    static int searchInRange(int[]arr, int target,int start,int end ){

        if (arr.length==0) {
            return -1
            ;
        }
        for (int index = start; index < end; index++) {
            if (target==arr[index]){
                return index;
            }
        }

        return -1;
    }
}
