public class MinCostOfChip {
    public static void main(String[] args) {
          int [] arr = {1,2,3};
        System.out.println(minCostToMoveChips(arr));
    }
        static public int minCostToMoveChips(int[] position) {
        int e = 0;
        int o=0;

        for(int p: position){
            if(p%2==0){
                e++;
            }else{
                o++;
            }
        }
         return Math.min(e,o);

    }
}
