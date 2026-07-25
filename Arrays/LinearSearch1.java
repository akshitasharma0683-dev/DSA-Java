public class LinearSearch1{
    public static void main(String[] args) {
        int[] num={56,564,23,19,-6,6,-33};
        int target =19;
        int ans = Searchnum(num,target);
        System.out.println(ans);
    }


     static int Searchnum(int[] num, int target){

        
        if (num.length==0) {
            return -1;
        }

        for(int index=0; index<num.length; index++){
            int element = num[index];
            if (element==target) {
                return index;
            }
        }

        return -1;
    }
}