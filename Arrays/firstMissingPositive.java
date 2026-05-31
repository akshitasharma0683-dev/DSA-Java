public class firstMissingPositive {
    public static void main(String[] args) {
        int [] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive1(arr));

        // Brute force solution
// Time Complexity: O(n^2)
// Will TLE for large inputs

    }



    static  public int firstMissingPositive1(int[] nums) {

        for(int range =1 ; range<=nums.length; range ++){
             if (findRange1(range, nums)) {
                 return range;
             }
        }
        return nums.length + 1;
    }
       static public boolean findRange1(int range, int[] nums) {
                boolean flag = false;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == range){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return true;
            }
            return false;
                }
            
        

            }
