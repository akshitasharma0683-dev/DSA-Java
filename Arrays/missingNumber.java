public class missingNumber{
    public static void main(String args[]){
     int [] nums={1};
     
     //{9,6,4,2,3,5,7,0,1};

     System.err.println(missingNumber(nums));
    }


     static  int missingNumber(int[] nums) {
        
 if (nums.length==0 && nums.length==1 ) {
            return -1;
        }

        for(int i=1; i<=nums.length; i++){
          if(linearSearch(nums, i) ==-1){
                return i;

          }
        }

        return -1;
    }

    static int linearSearch(int [] nums, int target){

        for(int i =0; i <= nums.length-1; i++){
            if (nums[i]==target) {
                return nums[i];
            }
        }
        return -1;
    }
}