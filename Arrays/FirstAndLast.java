import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int nums[]  = {5,7,7,7,7,8,8,8,10}; //1,4
        int target= 7;
        int ans[] = firstandlast(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstandlast(int[] nums, int target){
                int[] ans={-1,-1};
         ans[0] = search(nums, target, true);
         ans[1] = search(nums, target, false);

        return ans;
    }
   static  int search(int []nums,int target, boolean isfirstindex){
    int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid= start+(end - start)/2;

            if (target<nums[mid]) {
                end= mid-1;
            } else if (target>nums[mid]) {
                start =mid+1; 
            }
            else {
            ans=mid;
             
                if (isfirstindex) {
                    end=mid-1;
                }else{
                 start =mid+1; 

                }
            }
        }
                return ans;

    }
}
