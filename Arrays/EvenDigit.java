public class EvenDigit {
    public static void main(String[] args) {
        // [18,124,9,1746,98,1] =3 
       int [] nums={18,124,9,1746,98,1};
         int ans =number(nums);
         System.out.println(ans);
    }
    static int number(int []arr){
        int count = 0 ;
        for (int element : arr) {
            if (even(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int arr){
        int numberOfDigits= digit(arr);
        return (numberOfDigits%2==0);
            
    }

    static int digit(int  arr){
      int   count=0 ;
              while(arr>0){
                arr = arr/10;
                 count++;
              }
             
              return count;
      }
    }

